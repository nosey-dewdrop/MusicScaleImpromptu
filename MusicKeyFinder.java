package MusicalScaleIdentifier;
import java.util.*;

public class MusicKeyFinder {

      public static SongLibrary library;
      public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            boolean proceed = true;
            
            while(proceed){

                  System.out.println("\n♪♫ MENU ♪");
                  System.out.println("1. Determine a key for the song.");
                  System.out.println("2. List all the songs.");
                  System.out.println("♪♫♪⋆˚࿔♫⋆˚࿔");

                  System.out.println("(q) for quit. ");
                  System.out.print("Choice: ");
                  String answer = scanner.nextLine().toLowerCase();

                  if(answer.equals("1")){
                        /*
                         * determine the key for the song.
                         * add this song to the songs.
                         * first guess the scale. then add to the list if wanted to.
                         * 
                         * guesses are added to a different list too.
                         */

                        System.out.print("\nEnter song name: ");
                        String songName = scanner.nextLine();

                        Song song = new Song(songName);
                        boolean enterNotes = true;

                        while(enterNotes){
                              System.out.print("Enter notes: ");
                              String note = scanner.nextLine();
                              // validation for the note. is it fine from diatonic scale?
                              song.addNote(note);

                              System.out.println("Finished? (y/n)");
                              String ans = scanner.nextLine();

                              if(ans.equals("y")){

                                    library.addDrafts(song);
                                    System.out.println("Save it for song library?");
                                    String saveAns = scanner.nextLine();

                                    if(saveAns.equals("y")){
                                          library.addSong(song);
                                    }
                                    
                                    // y or n. you can modify both drafts and both the other one. save for drafts all the time.
                                    // check if the song is on either one of these.
                                    enterNotes = false;
                              }
                        }

                  }

                  else if(answer.equals("2")){

                  }

                  else if(answer.equals("q")){
                        System.out.println("Goodbye!!!! ");
                        proceed = false;
                  }

                  else{
                        System.out.println("Invalid option.");
                  }
            }
            scanner.close();

      }
}

