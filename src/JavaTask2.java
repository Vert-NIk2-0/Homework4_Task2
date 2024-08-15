import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaTask2 {
    public static void main(String[] args) {
        findingVowels(
                "asd+375(17)1234567asd " +
                "+375291234567 " +
                "da88 029 123 45 67f" +
                "a80 (29) 123 45 67as" +
                "d+375(29)123-45-67asd" +
                "+37533123 45 6fasa" +  //--
                "+375(33)123-45 67aa" + //--
                "gfh+375 29 123 45 67");
    }

    public static void findingVowels (String text) {
        Pattern pattern = Pattern.compile("((\\+375|80|8 0)( ?(29|25|17|33|44) ?| ?\\((29|25|17|33|44)\\) ?)(\\d{7}|\\d{3}([- ])\\d{2}\\7\\d{2}))");
        Matcher matcher = pattern.matcher(" " + text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}