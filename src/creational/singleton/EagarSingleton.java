package creational.singleton;

public class EagarSingleton {
    private static final EagarSingleton instance = new EagarSingleton();
    private EagarSingleton(){
    }
    public static EagarSingleton getInstance(){
        return instance;
    }
    public void print(){
        System.out.println("Class has been instanciated Correctly");
    }
}

