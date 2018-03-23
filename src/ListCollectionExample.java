import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Studentas on 3/23/2018.
 */
public class ListCollectionExample {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        names.add("Andrius");
        names.add("Petras");
        names.add("Jonas");
        names.add("Petras");
        names.add(2, "Jonas_2");

        for(String name : names){
            System.out.println(name);
        }

        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.get(1));

        numbers.add(12);
        numbers.add(11);
        numbers.add(3);
        numbers.add(5);

        Collections.sort(numbers);
        Collections.reverse(numbers);
        numbers.forEach(System.out :: println);

        names.forEach(a-> System.out.println("index " + names.indexOf(a) + " reiksmes " + a));

    }
}
