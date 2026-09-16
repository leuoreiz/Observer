public class observador extends absObservador {
    private absObservador observado;
    public observador(absObservado Observado) {
        this.observado = observado;
        this.observado.inscrever(this);
    }

    @override
    public void update(){
        Systen.out.println("notificacao recebida" + "Observador");
    }

}