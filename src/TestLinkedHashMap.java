import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestLinkedHashMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // не гарантируется порядок
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // гарантируется порядок добавления пар ключ-значение
        Map<Integer, String> treeMap = new TreeMap<>(); // отсортированы по ключу

        System.out.println("HashMap");
        testMap(hashMap);

        System.out.println();
        System.out.println("LinkedHashMap");
        testMap(linkedHashMap);

        System.out.println();
        System.out.println("TreeMap");
        testMap(treeMap);

    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
