package gof.Singleton;


/**
 *  Singleton "Eager"
 *  @author Gustavo-Felix
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
