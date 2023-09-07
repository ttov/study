package GPT_Issue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();

        List<Double> listDouble = new ArrayList<>();
        listDouble.add(0.005);
        listDouble.add(2.07);
        listDouble.add(3.14);
        listDouble.add(5.81);
        showListInfo(listDouble);

        List<?> listString = Arrays.asList("Hello", "World");
        showListInfo(listString);

        List<Integer> ali = new ArrayList<>();
        ali.add(14);
        ali.add(15);
        ali.add(16);

        System.out.println(sum(listDouble));
    }

    static void showListInfo(List<?> list) {
        System.out.println("My list contains next elements: " + list);
    }

    public static double sum(List< ? extends Number> list) {
        double summ = 0;
        for (Number number : list) {
            summ+= number.doubleValue();
        }
        return summ;
    }
}
