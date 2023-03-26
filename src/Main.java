import Playlist.PlaylistCreate.PlayList;
import Song.Song;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 99;
        Scanner sc  = new Scanner(System.in);
        PlayList playList = null;

        do {
            System.out.println("1: Create Playlist\n2: Add Song\n3: Print Playlist");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Playlist name");
                    String name = sc.nextLine();
                    playList = new PlayList(name);
                    break;
                case 2:
                    if(playList != null) {
                        sc.nextLine();
                        System.out.println("Enter Song name");
                        String songName = sc.nextLine();
                        System.out.println("Enter Artist name");
                        String artistName = sc.nextLine();
                        playList.addSong(new Song(songName, artistName));
                    }
                    break;
                case 3:
                    System.out.println(playList);
                    break;
                default:
                    System.out.println("\nUnknown command");
            }
        }while (choice != 9);
    }
}