package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Задача: Поиск телефонных номеров

Напишите программу, которая находит и выводит все телефонные номера в данном тексте.
Телефонные номера могут иметь разные форматы, такие как (123) 456-7890, 555-5555, 1234567890, и так далее.
Ваша программа должна искать и выводить все телефонные номера, которые соответствуют этим форматам.

Пример текста:
- (123) 456-7890
- 555-5555
- 1234567890
- +1 (800) 123-4567
 */
public class FindPhone {
    public static void main(String[] args) {
        String example = "- (123) 456-7890\n" +
                "- 555-5555\n" +
                "- 1234567890\n" +
                "- +1 (800) 123-4567";
        Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\s*\\d{3}-\\d{4}|\\d{3}-\\d{4}|\\+\\d+\\s*\\(\\d+\\)\\s*\\d+-\\d+");
        Matcher matcher = pattern.matcher(example);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
