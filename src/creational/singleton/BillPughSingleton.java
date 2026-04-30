package creational.singleton;

public class BillPughSingleton {
    private BillPughSingleton(){}
    private static class Holder{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return Holder.instance;
    }
    public void print(){
        System.out.println("Singleton class with Bill Pugh Singleton to make program thread safe");
    }
}
