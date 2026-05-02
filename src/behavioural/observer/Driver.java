package behavioural.observer;

public class Driver {
    public static void main(String[] args) {
        YouTubeChannel tuf = new YouTubeChannel("takeUforword");
        tuf.subscribe(new EmailSubscriber("subham@example.com"));
        tuf.subscribe(new MobileSubscriber("raj"));
        tuf.uploadVideo("observer-pattern");
    }
}
