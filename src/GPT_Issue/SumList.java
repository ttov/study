package GPT_Issue;
import java.util.*;
/* Задача:  У вас есть список чисел. Найти их сумму.
            Напишите программу, используя лямбда-выражение и функциональный интерфейс, чтобы найти сумму чисел в списке.

Вам нужно создать функцию (функциональный интерфейс) и использовать ее для вычисления суммы чисел в списке.
Вам также нужно будет передать эту функцию в метод, который будет выполнять вычисление.
 */
public class SumList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(15,20,10,5));
        System.out.println(sumAllList(numbers));
    }
    private static int sumAllList(List<Integer>list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}/*
     // лямбда-выражение для вычисления суммы чисел в списке

     // int sum = numbers.stream().mapToInt(number -> number.intValue()).sum();

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

     // .stream() - создает поток из списка чисел.
     // .mapToInt(Integer::intValue) - преобразует поток в поток примитивных чисел типа int.
     // .sum() - вычисляет сумму чисел в потоке.

 */
