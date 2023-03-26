package Playlist.PlaylistCreate;

import Playlist.PlaylistCreator;

import java.util.Map;

public class PlaylistCreate implements PlaylistCreator {
    public PlayList createPlaylist(String name) {
        return new PlayList(name);
    }
}
