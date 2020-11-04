import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestHashCode {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        map.put(1, "Один");
        map.put(1, "Другое значение");

        set.add(1);
        set.add(1);

        System.out.println(map);
        System.out.println(set);

        Map<Person, String> map2 = new HashMap<>();
        Set<Person> set2 = new HashSet<>();

        Person person1 = new Person(1, "Mike");
//        Person person2 = new Person(2, "Katy");
        Person person2 = new Person(1, "Mike");

        map2.put(person1, "123");
        map2.put(person2, "123");

        set2.add(person1);
        set2.add(person2);

        System.out.println(map2);
        System.out.println(set2);


        Set<String> set3 = new HashSet<>();
        set3.add("Hello");
        set3.add("Hello");
        System.out.println(set3);

    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}