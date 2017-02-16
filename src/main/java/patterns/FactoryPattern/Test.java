package patterns.FactoryPattern;

/**
 * Created by yevhenii.valkovskyi on 8/1/2016.
 */
public class Test {
    public static void main(String[] args) {
        Person person = PersonFactory.getPerson(Person_TYPE.PROGRAMMER);
        Person engineer = PersonFactory.getPerson(Person_TYPE.ENGINEER);
        Person teacher = PersonFactory.getPerson(Person_TYPE.TEACHER);

        person.sayYourProfesion();
        teacher.sayYourProfesion();
        engineer.sayYourProfesion();
    }

}
