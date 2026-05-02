package behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class VideoPlaylist {
    private List<Video> videos;
    public VideoPlaylist(){
        videos = new ArrayList<>();
    }
    public void addVideos(Video video){
        videos.add(video);
    }
    public List<Video> getVideos(){
        return videos;
    }
}
