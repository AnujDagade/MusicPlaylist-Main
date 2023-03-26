package Song;

public class Song {
    private String name;
    private String Artist;

    public Song(String name, String Artist) {
        this.name = name;
        this.Artist = Artist;
    }

    public String toString() {
        return  this.name;
    }
}
