import java.util.Objects;

public class Actor extends Person{
    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender, height);
    }

    @Override
    public boolean equals(Object o) {
        if (o==null || getClass()!=o.getClass()) return false;
        return super.equals(o);
    }
}
