/**
 * Created by Studentas on 3/23/2018.
 */
public class Person implements  Comparable<Person>{
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this(name);
        this.surname = surname;
    }

    public  Person(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!name.equals(person.name)) return false;
        return surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        return result;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}
