package structural.bridge;
/*
Bridge pattern is used to decouple the classes from their concrete implementation. Here VideoPlayer and Quality
has been decoupled. That means Quality of video remain independent of player.
 */
public class Driver {
    public static void main(String[] args) {
        // Playing on Web with HD Quality
        VideoPlayer player1 = new WebPlayer(new HDQuality());
        player1.play("Interstellar");

        // Playing on Mobile with Ultra HD Quality
        VideoPlayer player2 = new MobilePlayer(new UltraHDQuality());
        player2.play("Inception");
    }
}
