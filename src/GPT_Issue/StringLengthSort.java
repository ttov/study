package GPT_Issue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Напишите программу, которая сортирует массив строк по их длине с использованием лямбда-выражения.
Программа должна позволять пользователю вводить строки, а затем выводить их в порядке возрастания длины.

Пример:
Введите строки (для завершения введите пустую строку):
Hello
I
am
learning
Java

Отсортированные строки:
I
am
Java
Hello
learning
 */
public class StringLengthSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строки (для завершения введите пустую строку): ");
        List<String> strings = new ArrayList<>();
        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        strings.sort( (s1,s2) -> s1.length() - s2.length());

        System.out.println("Отсортированные пл длине строки: ");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
