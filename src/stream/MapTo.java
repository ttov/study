package stream;

import java.util.*;
import java.util.stream.IntStream;

public class MapTo {
    /*
 mapToInt() - метод для преобразования элементов потока в примитивные числовые значения
 (int, double, long).  он создает новый поток, содержащий числовые значения,
    принимает функцию (лямбда-выражение или ссылку на метод),
    которая определяет, как преобразовать каждый элемент потока.
     */

//    Преобразование объектов в целые числа:
    List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
    IntStream intStream = numbers1.stream().mapToInt(Integer::intValue);

//    Вычисление суммы элементов потока:
    List<Integer> numbers2 = Arrays.asList(10, 20, 30, 40, 50);
    int sum = numbers2.stream().mapToInt(Integer::intValue).sum();

//    Преобразование строковых значений в длины строк:
    List<String> strings = Arrays.asList("apple", "banana", "cherry");
    IntStream lengths = strings.stream().mapToInt(String::length);  // .mapToInt(s -> s.length())

//    Вычисление среднего значения чисел:
    List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
    double average = doubles.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
//                                   .mapToDouble(d -> d.doubleValue())
}
