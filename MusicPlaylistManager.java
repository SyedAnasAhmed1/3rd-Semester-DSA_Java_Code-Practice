import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MusicPlaylistManager {

    static class Song {
        String title;
        String artist;

        Song(String title, String artist) {
            this.title = title;
            this.artist = artist;
        }

        @Override
        public String toString() {
            return title + " by " + artist;
        }
    }

    static class Playlist {
        LinkedList<Song> songs = new LinkedList<>();

        void addSong(Song song) {
            songs.add(song);
        }

        void removeSong(int index) {
            if (index >= 0 && index < songs.size()) {
                songs.remove(index);
            }
        }

        void displaySongs() {
            if (songs.isEmpty()) {
                System.out.println("Playlist is empty.");
            } else {
                for (int i = 0; i < songs.size(); i++) {
                    System.out.println((i + 1) + ". " + songs.get(i));
                }
            }
        }
    }

    static class PlaybackQueue {
        Queue<Song> queue = new LinkedList<>();

        void addToQueue(Song song) {
            queue.offer(song);
        }

        void playNext() {
            if (!queue.isEmpty()) {
                System.out.println("Playing: " + queue.poll());
            }
        }

        void displayQueue() {
            if (queue.isEmpty()) {
                System.out.println("Queue is empty.");
            } else {
                for (Song song : queue) {
                    System.out.println(song);
                }
            }
        }
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        PlaybackQueue playbackQueue = new PlaybackQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Display Playlist");
            System.out.println("4. Add to Queue");
            System.out.println("5. Play Next");
            System.out.println("6. Display Queue");
            System.out.println("7. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    String title = scanner.nextLine();
                    String artist = scanner.nextLine();
                    playlist.addSong(new Song(title, artist));
                    break;
                case 2:
                    int index = scanner.nextInt() - 1;
                    playlist.removeSong(index);
                    break;
                case 3:
                    playlist.displaySongs();
                    break;
                case 4:
                    int songIndex = scanner.nextInt() - 1;
                    playbackQueue.addToQueue(playlist.songs.get(songIndex));
                    break;
                case 5:
                    playbackQueue.playNext();
                    break;
                case 6:
                    playbackQueue.displayQueue();
                    break;
                case 7:
                    return;
            }
        }
    }
}
