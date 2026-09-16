
public class abstract absObservador { 
protected List<absObservador> listaObservadores = new ArrayList<absObservador>();

public abstract void inscrever(absObservador observador);
public abstract void remover(absObservador observador);
}

