package structural.proxy;

import java.util.*;

public class CachedVideoDownloader implements VideoDownloader{
    private RealVideoDownloader downloader;
    private Map<String,String> cache;
    public CachedVideoDownloader(){
        this.downloader = new RealVideoDownloader();
        this.cache = new HashMap<>();
    }
    @Override
    public String downloadVideo(String videoUrl) {
        if(cache.containsKey(videoUrl)){
            System.out.println("Returning cached video for: " + videoUrl);
            return cache.get(videoUrl);
        }
        System.out.println("Cache miss. Downloading...");
        String video = downloader.downloadVideo(videoUrl);
        cache.put(videoUrl, video);
        return video;
    }
}
