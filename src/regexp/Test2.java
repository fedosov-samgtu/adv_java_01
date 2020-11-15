package regexp;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String a = "Hello there hey";
        String[] words = a.split(" ");
        System.out.println(Arrays.toString(words));

        a = "Hello.there.hey";
        words = a.split("\\.");
        System.out.println(Arrays.toString(words));

        a = "Hello23434there324hey323reff";
        words = a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b = "Hello there hey";
        System.out.println(b.replace(" ", "."));
        // replaceAll, replaceFirst

    }
}
