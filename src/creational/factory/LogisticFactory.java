package creational.factory;

public class LogisticFactory {
    public static Logistic getLogistic(String mode){
        if(mode.equalsIgnoreCase("Air")){
            return new Air();
        }else if(mode.equalsIgnoreCase("Road")){
            return new Road();
        }
        throw new IllegalArgumentException("Unknown Logistic mode "+mode);
    }
}
