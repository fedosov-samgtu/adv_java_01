import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {

        // ArrayIndexOutOfBoundsExceptio
//        int[] x = new int[3];
//        for (int i = 0; i < 4; i++) {
//            x[i] = 1;
//        }

//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        ArrayList<int> arrayList = new ArrayList<>();
        // только ссылочные типы!
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i); // добавили элемент
        }

        System.out.println(arrayList);

        // получить элемент по индексу
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(9));

        // размер arrayList
        System.out.println(arrayList.size());

        // пройти по элементам:
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        System.out.println();
        for (Integer x : arrayList) {
            System.out.print(x + "-");
        }

        // удалить элемент с индексом 5
        // очень не эффективен при удалении в начале/середине листа
        System.out.println();
        arrayList.remove(5);
        System.out.println(arrayList);

        // созданные листы следует ссылать на интерфейс List, а не на класс ArrayList
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i); // добавили элемент
        }
        for (Integer x : list) {
            System.out.print(x + "-");
        }

        // много удалений из нашего листа
        list = new LinkedList<>();
        // созданные листы следует ссылать на интерфейс List, а не на класс ArrayList
        // сослались на класс LinkedList
        // можем эффективно удалять объекты
        // нужно перенести все элементы из старого листа

        // можем сразу указать количество элементов в массиве
        List<Integer> list2 = new ArrayList<>(100);

    }
}
