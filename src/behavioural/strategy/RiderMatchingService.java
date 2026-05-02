package behavioural.strategy;

public class RiderMatchingService {
    private MatchingStrategy strategy;
    public RiderMatchingService(MatchingStrategy strategy){
        this.strategy = strategy;
    }
    public void setStrategy(MatchingStrategy strategy){
        this.strategy = strategy;
    }
    public void matchRider(String location){
        strategy.match(location);
    }
}
