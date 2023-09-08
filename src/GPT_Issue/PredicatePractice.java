package GPT_Issue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
/*
Задача: Фильтрация списка строк
У вас есть список строк, и вы хотите отфильтровать строки, удовлетворяющие определенному условию.
Напишите программу, которая использует лямбда-выражение и предикат для фильтрации строк в списке.
 */
public class PredicatePractice {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Orange");
        strings.add("Cherry");
        strings.add("Date");
        strings.add("Elderberry");

        Predicate<String> filter = s -> s.startsWith("D");  // Задаю предикат для фильтрации строк по условию

        List<String> listSort = filterString(strings, filter);

        for (String s : listSort) {     // Вывод отфильтрованных строк
            System.out.println(s);
        }
    }
    private static List<String> filterString(List<String>strings, Predicate<String>filter) {
        List<String> filtered = new ArrayList<>();
        for (String s : strings) {
            if (filter.test(s)) {
                filtered.add(s);
            }
        }
        return filtered;
    }
}
