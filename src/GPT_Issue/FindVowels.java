package GPT_Issue;
import java.util.Scanner;
/*
Напишите программу на Java, которая запрашивает у пользователя строку
и подсчитывает количество гласных букв (a, e, i, o, u) в этой строке.
Программа должна игнорировать регистр букв
(то есть, считать "A" и "a" как одну и ту же букву).

Введите строку: Hello, World!
Количество гласных букв: 3
 */
public class FindVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input string: ");
        String str= scan.nextLine();
        int count = 0;

        char[] symbols = str.toCharArray();
        for (char symbol : symbols) {
            char c = Character.toLowerCase(symbol);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("Kol-vo glasnyh: "+count);
    }
}
