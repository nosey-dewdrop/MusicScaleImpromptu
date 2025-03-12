package MusicalScaleIdentifier;
import java.util.*;

public class SongLibrary {

      private ArrayList<Song> songs;
      private ArrayList<Song> drafts;
      
      public SongLibrary(){
            songs = new ArrayList<Song>();
            drafts = new ArrayList<Song>();
      }

      public void addSong(Song song){
            songs.add(song);
      }

      public void addDrafts(Song song){
            drafts.add(song);
      }

      public ArrayList<Song> getSongs() {
            return songs;
      }

      public ArrayList<Song> getDemoSongs() {
            return drafts;
      }


}
