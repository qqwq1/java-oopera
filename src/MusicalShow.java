import java.time.Duration;
import java.util.ArrayList;

public class MusicalShow extends Show {
    protected final Person musicAuthor;
    protected final String librettoText;

    public MusicalShow(String title, Duration duration, Director director,
                       ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText(){
        System.out.println(librettoText);
    }
}
