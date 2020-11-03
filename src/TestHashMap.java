import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        System.out.println(map);

        map.put(3, "Тройка");
        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.get(10));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        System.out.println();
        Map<String, String> translations = new HashMap<>();

        translations.put("кошка", "cat");
        translations.put("собака", "dog");
        translations.put("слон", "elephant");
        for (Map.Entry entry : translations.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



    }
}
