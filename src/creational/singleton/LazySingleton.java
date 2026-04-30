package creational.singleton;

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
    public void print(){
        System.out.println("This is Lazy Intitalization Without Thread Safe");
    }
}
