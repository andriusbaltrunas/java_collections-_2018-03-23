import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Studentas on 3/23/2018.
 */
public class SetCollectionsExample {


    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(123);
        numbers.add(3);
        numbers.add(9);
        numbers.add(12);
        numbers.add(9);

        numbers.forEach(System.out :: println);

        Set<Person> persons = new TreeSet<>();

        persons.add(new Person("Andrius", "Baltrunas"));
        Person p = new Person("Tomas", "JOnas");
        persons.add(p);
        persons.add(new Person("Andrius", "Baltrunas"));

        persons.forEach(pp ->{
            System.out.println("Vardas " + pp.getName() + " pavarde " + pp.getSurname());
        });
    }
}
