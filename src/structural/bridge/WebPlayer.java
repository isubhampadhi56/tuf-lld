package structural.bridge;

public class WebPlayer extends VideoPlayer{
    public WebPlayer(VideoQuality quality){
        super(quality);
    }
    @Override
    public void play(String title) {
        System.out.println("Web Platform:");
        quality.load(title);
    }
}
