public class consumidor{
    public static void main( Strind[] args) {
        observado observado = new observado();
        observador observer1 = new observador(observado);
        observado.setState(10);
        
    }
}