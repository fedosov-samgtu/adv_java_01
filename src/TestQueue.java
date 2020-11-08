import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {
    public static void main(String[] args) {
        Person4 person1 = new Person4(1);
        Person4 person2 = new Person4(2);
        Person4 person3 = new Person4(3);
        Person4 person4 = new Person4(4);

        Queue<Person4> people = new LinkedList<>();
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);

        for (Person4 person : people) {
            System.out.println(person);
        }

        System.out.println();
//        Queue<Person4> people2 = new ArrayBlockingQueue<Person4>(10); // максимальная длина очереди
        Queue<Person4> people2 = new ArrayBlockingQueue<Person4>(3); // максимальная длина очереди
//        people2.add(person3);
//        people2.add(person2);
//        people2.add(person4);
//        people2.add(person1);
        System.out.println(people2.offer(person3));
        System.out.println(people2.offer(person2));
        System.out.println(people2.offer(person4));
        System.out.println(people2.offer(person1));
        System.out.println();
        for (Person4 person : people2) {
            System.out.println(person);
        }

        System.out.println("Забираем элемент из очереди: " + people2.remove());
        System.out.println();
        for (Person4 person : people2) {
            System.out.println(person);
        }
        System.out.println();

        System.out.println(people2.peek()); // посмотреть первый элемент в очереди
        System.out.println();
        for (Person4 person : people2) {
            System.out.println(person);
        }

    }
}

class Person4 {
    private int id;

    public Person4(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person4{" +
                "id=" + id +
                '}';
    }
}