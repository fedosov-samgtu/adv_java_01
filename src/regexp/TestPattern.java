package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {
    public static void main(String[] args) {
        String text = "Hello test ffdd sdsd test1@gmail.com dd s\n" +
                "dsds sdsds  ewdwe dewd wed \n" +
                "dddccc cd cd test2@mail.ru adas sssas test3@yandex.ru...";

        Pattern email = Pattern.compile("\\w+@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }


        Pattern email2 = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher2 = email2.matcher(text);

        while (matcher2.find()) {
            System.out.println(matcher2.group(1));
        }


    }
}
