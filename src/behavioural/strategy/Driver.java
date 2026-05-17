package behavioural.strategy;

public class Driver {
    public static void main(String[] args) {
        RiderMatchingService riderMatchingService = new RiderMatchingService(new AirportQueueStrategy());
        riderMatchingService.matchRider("Terminal 1");

        RiderMatchingService riderMatchingService2 = new RiderMatchingService(new NearestDriverStrategy());
        riderMatchingService2.matchRider("Downtown");
        riderMatchingService2.setStrategy(new SurgePriorityStrategy());
        riderMatchingService2.matchRider("Downtown");
    }
}
