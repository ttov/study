package stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();     // создал список
        list.add(2);
        list.add(4);                // зполнил
        list.add(6);               //       его
        list.add(8);
        list.add(10);
        System.out.println(list);       // вывел в консоль

        for (Integer integer : list) {          // можно "пробежаться" по списку через foreach
            System.out.print(integer+" ");     // вывести каждый элемент
        }
//      Но перебирать список
//              и одновременно обрабатывать в нем элементы нельзя
//    такие вещи только через Iterator

        Iterator<Integer> iter = list.iterator(); // объявляю переменную iter типа Iterator<Integer>
//      означает, что iter будет хранить итератор, способный перебирать элементы типа Integer
//      list.iterator(); - это вызов метода iterator() у списка list   // Collection.iterator()
//      ну и через оператор присваивания "=" присваиваем результат вызова list.iterator() переменной iter,
//                                                                         чтобы иметь доступ к итератору
        while (iter.hasNext()) {     // пока итератор содержит(имеет) след.значение(элемент)
            Integer element = iter.next();  // присваиваем это след.значение переменной element типа Integer
//      Это как раз для того, чтобы над ним провести какую-то операцию.
//      т.е. итератор видит - след.элемент есть! (iter.hasNext()==true)
//      и помещает значение этого следующего элемента (iter.next()) в переменную element типа Integer

            iter.remove();    // и при помощи метода remove() удаляет этот элемент из списка
                              //  и так циклом while по всему списку
        }
        System.out.println(list); // теперь пустой список в консоли выглядит так: []
//----------------------------------------------------------------------------------------------------------
//      И если бы список не был пуст
//      для операции над его элементами при помощи метода reduce()
//      создал бы поток из элементов списка
//      list.stream().reduce( лямда-выражение-> какой-нибудь операции )
        list.stream().reduce((accumulator, element) -> accumulator + element); // внашем случае сложения
//                            accimulator - это аккумулированное значение,                          |
//                            которое используется для накопления результатов какой то операции(сложения)
//      ну и element - текущий элемент из потока данных
//      то есть ((аккумулированное значение, текущий элемент) -> аккумулированное значение + текущий элемент)
//                 ---------------operator------------------      -------------операция--------------------
//      результат операции accumulator + element накапливается в accimulator (становится его новым значением)
//      процесс продолжается до тех пор, пока не будут обработаны все элементы коллекции (списка)

//      Так как мы складывали(аккумулировали) Integer'овые значения списка
//      результат нужно собрать методом get()
//         list.stream().reduce((accumulator, element) -> accumulator + element).get();

//      и поместить в соотв.переменную
//         int result = list.stream().reduce((accumulator, element) -> accumulator + element).get();
//         System.out.println(result);    // вывод результата в консоль

//        но так наш список пуст, а метод get() этого не предполагает (будет ошибка)
//        вместо него надо обезопасить себя методом который это предполагает  .orElse(0)
        int result = list.stream().reduce((accumulator, element) -> accumulator + element).orElse(0);
        System.out.println(result);

//                                          ИЛИ
        Optional<Integer> o = list.stream().reduce((accumulator, element) -> accumulator + element);
        if (o.isPresent()) {
            System.out.println(o.get());
        }else System.out.println("Not present");
    }
}
