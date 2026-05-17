package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Channel{
    private List<Subscriber> subscribers;
    private String channelName;
    public YouTubeChannel(String channelName){
        this.channelName = channelName;
        subscribers = new ArrayList<>();
    }
    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String videoTitle) {
        for (Subscriber subscriber: subscribers){
            subscriber.update(videoTitle);
        }
    }
    public void uploadVideo(String videoTitle){
        System.out.println(channelName + " uploaded: "+videoTitle+"\n");
        notifySubscriber(videoTitle);
    }
}
