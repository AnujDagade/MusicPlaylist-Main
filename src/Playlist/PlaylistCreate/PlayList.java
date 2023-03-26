package Playlist.PlaylistCreate;

import java.util.ArrayList;
import java.util.Iterator;

import  Song.Song;
public class PlayList {
    private String name;


    private ArrayList<Song> songs;

    public PlayList(String name) {
        this.name = name;
        songs = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public String toString() {
        String names = null;
        Iterator<Song> itr = songs.iterator();
        while(itr.hasNext())
        {
            names = itr.next().toString();
        }
        return names;
    }
}
