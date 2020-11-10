package regexp;

public class Test {
    public static void main(String[] args) {
        String a = "1234";
        System.out.println(a.matches("1234"));
        System.out.println(a.matches("1235"));

        a = "hello";
        System.out.println(a.matches("1234"));
        System.out.println(a.matches("hello"));

        /*

        \\d - одна цифра
        \\w - одна английская буква, аналогично [a-zA-Z]

        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов до
        (x|y|z) - одна строка из множества строк
        \\+ - специальный символ + в качестве обычной буквы
        \\. - специальный символ . в качестве обычной буквы

        (a|b|c|d|...|A|B|C|...) - любая английская буква
        [a-zA-Z] - все английские буквы
        [abc] соответствует (a|b|c)
        [0-9] - все цифры. аналогично \\d
        [^abc] - все символы, кроме [abc]
        [^a-z] - все символы, кроме маленьких английских букв

        . - любой символ
        {2} - точное количество предыдущих символов. 2 символа до (\\d{2}) - 2 цифры
        {2,} - 2 или более символов (\\d{2,}) от 2 до бесконечности цифр
        {2,4} - от 2 до 4 символов (\\d{2,4}) от 2 до 4 цифр

https://regexlib.com/
https://regexlib.com/CheatSheet.aspx
         */

        System.out.println();
        a = "d";
        System.out.println(a.matches("d"));
        System.out.println(a.matches("\\d"));

        a = "1";
        System.out.println(a.matches("\\d"));

        a = "91";
        System.out.println(a.matches("\\d"));

        a = "91";
        System.out.println(a.matches("\\d+"));

        System.out.println();
        a = "";
        System.out.println(a.matches("\\d+"));
        System.out.println(a.matches("\\d*"));

        System.out.println("-----------");
        a = "-10";
        String b = "23";
        System.out.println(a.matches("\\d*"));
        System.out.println(b.matches("\\d*"));

        String c = "+233";
        System.out.println(a.matches("-?\\d*"));
        System.out.println(b.matches("-?\\d*"));
        System.out.println(c.matches("-?\\d*"));

        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));


        System.out.println("01");
        String d = "s22424";
        System.out.println(d.matches("[a-zA-Z]\\d+"));
        d = "adaDFFds22424";
        System.out.println(d.matches("[a-zA-Z]\\d+"));
        System.out.println(d.matches("[a-zA-Z]+\\d+"));

        System.out.println("02");
        d = "adaD2FFds22424";
        System.out.println(d.matches("[a-zA-Z]+\\d+"));
        d = "a555daD255555FFds22424";
        System.out.println(d.matches("[a-zA-Z25]+\\d+"));

        System.out.println("03");
        String e = "hello";
        System.out.println(e.matches("[^abc]*")); // все символы, кроме abc, количество от 0 до бесконечности
        e = "axcccsss";
        System.out.println(e.matches("[^abc]*")); // все символы, кроме abc, количество от 0 до бесконечности


        String url = "http://www.google.com";
        // является ли строка валидным url сайта?
        System.out.println(url.matches("http://www\\..+\\.(com|ru)")); // все символы, кроме abc, количество от 0 до бесконечности

        url = "http://www.yandex.ru";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)")); // все символы, кроме abc, количество от 0 до бесконечности

        url = "http://wwwyandex.ru";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)")); // все символы, кроме abc, количество от 0 до бесконечности

        System.out.println("04");
        String f = "123";
        System.out.println(f.matches("\\d{2}")); // все символы, кроме abc, количество от 0 до бесконечности
        f = "13";
        System.out.println(f.matches("\\d{2}")); // все символы, кроме abc, количество от 0 до бесконечности

    }
}
