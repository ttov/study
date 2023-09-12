package linkedList;

public class LinkedList<T> {               // Список(связный) чего-то..(типа <T>)
    private Node<T> head;                  // содержит ссылку(переменная head) на "голову" списка. (= null) список пуст.

    public void addFirst(T t) {            // метод, чтобы добавить новое значение(типа Т) в начало Linked-листа
        Node<T> firstNode = new Node<>(t); // создаю новый элемент(new Node<>типа(t)  в котором..
        firstNode.next = head;             // полю next(ссылка на след.элемент) присваиваю текущее значение "головы" т.е.null
        head = firstNode;                  // а так же присваиваю элемент(firstNode) в "голову" списка (в начало)
    }
                                            // Таким образом, firstNode становится первым элементом списка
                                            // со ссылкой на следующий элемент(firstNode.next)
                                            // который в момент присвоения был проинициализирован(=null)

    public void addLast(T t) {             // метод для добавления значения(типа Т) В КОНЕЦ Linked-листа
        if (head == null) {                // в первую очередь проверяю - не пуст ли наш лист(список)? И если head=null то..
            head = new Node<>(t);          // помещаю в (переменную) head новый элемент(Узел) типа(t)
            return;         // тут return;                // НО ЕСЛИ head != null
        }                                                //  и узел есть..
        Node<T> currentNode = head;        // создаю новый Node<T>, в который помещаю head
        while (currentNode.next != null) { //       ВСЁ!! ЕБАЛ Я В РОТ!!!
            currentNode = currentNode.next;//       НИХУЯ НЕ ПОНИМАЮ!!!!
        }

    }

    public int get(T t) {                  // метод, чтобы найти элемент по значению(T t) в списке
        return -1;                         // и вернуть "-1" если элемент не найден
    }

    public void remove(T t) {              // метод, чтобы(искать)удалять элемент из списка

    }

// ------------------------------------------------------------------------------------------------------------

    private static class Node<T> {        // создаю внутр.класс для хранения разных типов данных <T>
        private final T value;            // содержит неизменяемое значение(value) типа <T>   (=null)
        private Node<T> next;             // и содержит ссылку(переменная next) на след.объект (класса Node<T>) (=null)

        private Node(T value) {          // КОНСТРУКТОР
            this.value = value;
        }
    }

}
