package behavioural.iterator;

public class Driver {
    public static void main(String[] args) {
        VideoPlaylist playlist = new VideoPlaylist();
        playlist.addVideos(new Video("LLD Tutorials"));
        playlist.addVideos(new Video("System Design Basics"));
        PlaylistIterator playlistIterator = new VideoPlaylistIterator(playlist.getVideos());
        while(playlistIterator.hasNext()){
            System.out.println(playlistIterator.next().getTitle());
        }
    }
}
