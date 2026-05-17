package behavioural.strategy;

public class SurgePriorityStrategy implements MatchingStrategy{
    public void match(String riderLocation) {
        System.out.println("Matching rider using surge pricing priority near "+ riderLocation);
    }
}
