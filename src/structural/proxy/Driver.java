package structural.proxy;
/*
Instead of directly access the RealVideoDownloader class we can have controlled access to the class
through CachedVideoDownloader, which first check if the video is cached if not it downloads it.
 */
public class Driver {
    public static void main(String[] args) {
        VideoDownloader cacheVideoDownloader = new CachedVideoDownloader();
        System.out.println("User 1 tries to download the video.");
        cacheVideoDownloader.downloadVideo("https://video.com/proxy-pattern");

        System.out.println();

        System.out.println("User 2 tries to download the same video again.");
        cacheVideoDownloader.downloadVideo("https://video.com/proxy-pattern");
    }
}
