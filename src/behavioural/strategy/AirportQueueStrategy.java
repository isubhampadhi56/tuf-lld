package behavioural.strategy;

public class AirportQueueStrategy implements MatchingStrategy{
    public void match(String riderLocation) {
        System.out.println("Matching using FIFO airport queue for "+ riderLocation);
    }
}
