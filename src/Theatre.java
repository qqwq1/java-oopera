import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Theatre {
    public static void main(String[] args) {
        //task1
        Actor actor1 = new Actor("Ivan", "Leshchev", Gender.MALE, 185);
        Actor actor2 = new Actor("Ekaterina", "Leshcheva", Gender.FEMALE, 163);
        Actor actor3 = new Actor("Vladimir", "Kuznetsov", Gender.MALE, 120);
        Director director1 = new Director("Petr", "Vasko", Gender.MALE, 30);
        Director director2 = new Director("Wo", "Glent", Gender.FEMALE, 57);
        Person musicAuthor = new Person("Petr", "Chay", Gender.MALE);
        Person choreographer = new Person("Yana", "Kutuzova", Gender.FEMALE);

        //task2
        Show classicalShow = new Show("Harry Poter", Duration.ofMinutes(120), director1, new ArrayList<>());
        Opera opera = new Opera("Boris Godunov", Duration.ofMinutes(180), director2, new ArrayList<>(),
                musicAuthor, "Some opera libretto text", 4);
        Ballet ballet = new Ballet("Swan lake", Duration.ofMinutes(215), director1, new ArrayList<>(), musicAuthor,
                "some balet libretto text", choreographer);

        //task3
        classicalShow.addActor(actor1);
        classicalShow.addActor(actor2);
        opera.addActor(actor1);
        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        //task4
        classicalShow.printActorsInfo();
        System.out.println();
        opera.printActorsInfo();
        System.out.println();
        ballet.printActorsInfo();
        System.out.println();

        //task5
        classicalShow.replaceActor(actor3, "Leshchev");
        classicalShow.printActorsInfo();
        System.out.println();

        //task6
        opera.replaceActor(actor3, "someSurname");
        System.out.println();

        //task7
        opera.printLibrettoText();
        ballet.printLibrettoText();
    }

}
