package MusicalScaleIdentifier;
import java.util.ArrayList;

public class Song{

      private String songName;

      private ArrayList<String> notes;
      private String key;

      public Song(String songName){
            this.songName = songName;
            notes = new ArrayList<String>();
      }

      public String getSongName() {
            return songName;
      }

      public ArrayList<String> getNotes() {
            return notes;
      }

      public void addNote(String note){
            notes.add(note);
      }

      public String getKey() {
            return key;
      }

      
}