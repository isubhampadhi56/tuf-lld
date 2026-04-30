package creational.singleton;

public class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance;
    private DoubleCheckSingleton(){}
    public static DoubleCheckSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
    public void print(){
        System.out.println("ThreadSafe singleton with double locking");
    }
}
