package week_05;
interface Playable {
	 void play();
	}
	//Abstract Media class
	 abstract class Media {
	 protected String title;
	 protected int duration; // Duration in seconds

	 public Media(String title, int duration) {
	     this.title = title;
	     this.duration = duration;
	 }
	}

	//Song class extending Media and implementing Playable
	 class Song extends Media implements Playable {
	 private String artist;

	 public Song(String title, String artist, int duration) {
	     super(title, duration);
	     this.artist = artist;
	 }

	 @Override
	 public void play() {
	     System.out.println("Playing song: " + title + " by " + artist + " (" + duration + " seconds)");
	 }
	}
//Video class extending Media and implementing Playable
	 class Video extends Media implements Playable {
	 private String director;

	 public Video(String title, String director, int duration) {
	     super(title, duration);
	     this.director = director;
	 }

	 @Override
	 public void play() {
	     System.out.println("Playing video: " + title + " directed by " + director + " (" + duration + " seconds)");
	 }
	}        
public class MEDIA_LIBRARY_SYSTEM {  

	 public static void main(String []args) {
	     Playable[] mediaCollection = new Playable[4];
	     mediaCollection[0] = new Song("Shape of You", "Ed Sheeran", 234);
	     mediaCollection[1] = new Song("Bohemian Rhapsody", "Queen", 354);
	     mediaCollection[2] = new Video("Inception", "Christopher Nolan", 8880);
	     mediaCollection[3] = new Video("Interstellar", "Christopher Nolan", 9660);

	     for (Playable media : mediaCollection) {
	         media.play();
}
	     }
}
