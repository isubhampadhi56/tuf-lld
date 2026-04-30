package creational.factory;

public class Driver {
    public static void main(String[] args) {
        Logistic cls = LogisticFactory.getLogistic("air");
        cls.send();
    }
}
