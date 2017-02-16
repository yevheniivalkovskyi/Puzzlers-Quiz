package patterns.FactoryPattern;

/**
 * Created by yevhenii.valkovskyi on 8/1/2016.
 */
public class PersonFactory {

    public static Person getPerson(Person_TYPE person_type) {

        switch (person_type) {
            case PROGRAMMER:
                return new Programmer();
            case ENGINEER:
                return new Engineer();
            case TEACHER:
                return new Teacher();

        }
        return null;
    }
}
