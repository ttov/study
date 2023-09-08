package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {
    public static void main(String[] args) {
        String s1 = "Море море Океан Река речь";
//        Pattern pattern = Pattern.compile("море");
//        Matcher matcher = pattern.matcher(s1);

        Matcher matcher = Pattern.compile(".оре").matcher(s1);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
