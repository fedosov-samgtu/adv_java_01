import java.util.*;

public class TestComparable {
    public static void main(String[] args) {
        List<Person3> peopleList = new ArrayList<>();
        Set<Person3> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);

    }

    private static void addElements(Collection collection) {
        collection.add(new Person3(3, "Katy"));
        collection.add(new Person3(4, "George"));
        collection.add(new Person3(2, "To"));
        collection.add(new Person3(1, "Bob"));
    }
}

class Person3 implements Comparable<Person3> {
    private int id;
    private String name;

    public Person3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person3 person3 = (Person3) o;

        if (id != person3.id) return false;
        return name != null ? name.equals(person3.name) : person3.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person3 o) {
//        if (this.id > o.getId()) {
//            return 1;
//        } else if (this.id < o.getId()) {
//            return -1;
//        } else {
//            return 0;
//        }

        // сортировка по длине имени
        if (this.name.length() > o.getName().length()) {
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }

    }
}