package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciExample {
    public static void main(String[] args) {
        int n = 10;

        List<Integer> fibonacciSeries = generateFibonacci(n);
        System.out.println(fibonacciSeries);
    }

    private static List<Integer> generateFibonacci(int n) {
        List<Integer> fibonacciSeries = new ArrayList<>();
        if (n >= 1) {
            fibonacciSeries.add(0);
        }
        if (n >= 2) {
            fibonacciSeries.add(1);
        }
        if (n >= 3) {
            Stream.iterate(new int[]{1, 1}, prev -> new int[]{prev[1], prev[0] + prev[1]})
                    .limit(n -2).map(arr -> arr[1])
                    .collect(Collectors.toCollection(() -> fibonacciSeries));
        }
        return fibonacciSeries;
    }
}
