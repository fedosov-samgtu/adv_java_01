import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.get(0);
//        linkedList.size();
//        linkedList.remove(0);
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {
//        for (int i = 0; i < 100000; i++) {
//            list.add(i);
//        }

        long start = System.currentTimeMillis();

//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // разница на треть...в 2 раза
//        for (int i = 0; i < 1000000; i++) {
//            list.add(i);
//        }

        // считывание по индексу в arrayList в тысячу раз быстрее!
//        for (int i = 0; i < 100000; i++) {
//            list.get(i);
//
//        }

        // arrayList более чем в 100 раз медленнее
        for (int i = 0; i < 100000; i++) {
            // добавляем новые элементы в 0 позицию
            list.add(0, i);
        }




        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

}
