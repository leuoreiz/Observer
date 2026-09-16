public class observado extends absObservado {
    //PRORIEDADE DE INTERESSE (é o estado)
    private int state;
    public int getState() {
        return this.state;
    }

    public void setState(int novoState) {
        this.state = novo_state;
        this.notificarTodos();
    }

    private void notificarTodos() {
        for(absObservador observador : this.listaObservadores) {
                observador.update();
        }
    }
}