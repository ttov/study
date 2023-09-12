package stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        System.out.println(list);

//        for (Integer integer : list) {
//            System.out.println(list);
//        }

        Iterator<Integer> iter = list.iterator();       //
        while (iter.hasNext()) {                        //  очистить список
            Integer element = iter.next();              //
            iter.remove();                              //
        }
        System.out.println(list);                       //  отобразить пустой список

//        int result = list.stream().reduce((accumulator, element) -> accumulator + element).get();
//        System.out.println(result);
//                                          ИЛИ
        int result = list.stream().reduce((accumulator, element) -> accumulator + element).orElse(0);
        System.out.println(result);     // 30

//                                          ИЛИ     вариант с начальным идентификатором аккумуляции
        // даже пустой список гарантировано содержит единицу    // ни .get() ни .orElse(0) в конце не нужны
        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator + element);
        System.out.println(result2);    // 31

    }
}
