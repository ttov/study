package GPT_Issue;

import java.util.Scanner;

/*
Напишите программу, которая проверяет, является ли введенная пользователем строка палиндромом.
Палиндром - это строка, которая читается одинаково слева направо и справа налево.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input word: ");
        String str = scan.next().replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            isPalindrome = true;
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }


    }
}
