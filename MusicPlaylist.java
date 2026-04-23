import java.util.*;

public class MusicPlaylist {
    public static void main(String[] args) {

        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

        System.out.println("Playlist:");
        display(playlist);

        System.out.println("\nPlaying first song: " + playlist.removeFirst());
        System.out.println("Playlist after playing first song:");
        display(playlist);

        System.out.println("\nSkipping last song: " + playlist.removeLast());
        System.out.println("Playlist after skipping last song:");
        display(playlist);

        System.out.println("Maitri chauhan");
        System.out.println("250393107003");
    }

    public static void display(LinkedList<String> list) {
        for (String song : list) {
            System.out.println(song);
        }
    }
}