package GPT_Issue;
import java.util.*;
/*
Напишите программу, которая принимает список целых чисел и вычисляет сумму квадратов этих чисел.
 */
public class SumOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 10, 7, 2);

        int sum = numbers.stream().mapToInt(num -> num * num).sum();
        System.out.println(sum);
    }
}
