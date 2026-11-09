import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task4 {
    public static void main(String[] args) {
        String text = "a1a a2b a3c a4d a5e";
        Pattern pattern = Pattern.compile("a\\d[b-e]");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Исходная строка: " + text);
        System.out.println("Найденные подстроки:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
