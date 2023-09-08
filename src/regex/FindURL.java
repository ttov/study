package regex;

import java.util.regex.*;

public class FindURL {
    public static void main(String[] args) {
        String example = "- http://www.example.com\n" +
                "- https://example.org\n" +
                "- www.google.com\n" +
                "- ftp://ftp.server.com";

        Matcher matcher = Pattern.compile("\\b(https?://|www\\.|ftp://)\\S+\\b").matcher(example);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
