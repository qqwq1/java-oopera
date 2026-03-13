import java.time.Duration;
import java.util.ArrayList;

public class Show {
    private String title;
    private Duration duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, Duration duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirectorInfo() {
        System.out.println("Режиссер спектакля: " + director.getName() + " " + director.getSurname());
    }

    public void printActorsInfo() {
        System.out.println("В спектакле участвуют:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + ")");
        }
    }

    public void addActor(Actor actor){
        if (!listOfActors.contains(actor)){
            listOfActors.add(actor);
        }
        else {
            System.out.println("Такой актер уже участвует в спектакле!");
        }
    }

    public void replaceActor(Actor actor, String replaceSurname){
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(replaceSurname)){
                listOfActors.set(i,actor);
                return;
            }
        }
        System.out.println("Актер с фамилией " + replaceSurname + " не участвует в спектакле!");
    }
}
