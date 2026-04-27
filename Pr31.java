import java.util.*;

public class Pr31 {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song1");
        playlist.add("Song2");
        playlist.add("Song3");

        System.out.println("Playlist: " + playlist);

        playlist.removeFirst();
        System.out.println("After removing first song: " + playlist);

        playlist.removeLast();
        System.out.println("After removing last song: " + playlist);
    }
}