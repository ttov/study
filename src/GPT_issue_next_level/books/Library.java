package GPT_issue_next_level.books;

import java.util.*;

//Задача: Создать список List<Book> и добавить в него несколько книг.

public class Library {
    public static void main(String[] args) {

        Book b1 = new Book("Azbuka", "Ivanov V.V.", "ychebnik", 350.2, 5.0);
        Book b2 = new Book("Bukvar", "Petov A.A.", "ychebnik", 370.2, 5.5);
        Book b3 = new Book("1984", "J.Oruel", "fantastic", 1150., 8.0);
        Book b4 = new Book("Kvadrant", "Kiyosaki R.", "non-fiction", 999.9, 6.7);
        Book b5 = new Book("4 prom.rev", "Claus Shwab", "non-fiction", 750.2, 7.1);
        Book b6 = new Book("Slovar", "Ozhegov A.B.", "ychebnik", 550.2, 5.9);
        Book b7 = new Book("3 zakona for robots", "A.Azimov", "fantastic", 950.2, 8.2);


        List<Book> bookList = new ArrayList<>();
        bookList.add(b3);
        bookList.add(b5);
        bookList.add(b4);
        bookList.add(b1);
        bookList.add(b6);
        bookList.add(b2);
        bookList.add(b7);

        System.out.println(listOfGenre(bookList,"fantastic"));
        System.out.println(highestPrice(bookList));

//  //      Тут я пердикатом пробую..  (для 1.пункта)
//        Predicate<Book> predicate = book -> book.getGenre().equals("non-fiction");
//        List<String> sortedList = filtered(bookList, predicate);
//        System.out.println(sortedList);





    }
//  //  Тут я пердикат расписываю..
//    private static List<String> filtered(List<Book> bookList, Predicate<Book> predicate) {
//        List<String> filtered = new ArrayList<>();
//        for (Book book : bookList) {
//            if (predicate.test(book)) {
//                filtered.add(book.getTitle());
//            }
//        }
//        return filtered;
//    }

    //    1. метод, который фильтрует книги определенного жанра и возвращает список книг этого жанра.
    public static List<Book> listOfGenre(List<Book> list, String genre) {
        return list.stream().filter(b -> b.getGenre().equals(genre)).toList();
    }

    // 2. метод, который находит книгу с наибольшей ценой и возвращает ее.
    public static Optional<Book> highestPrice(List<Book> list) {
        return list.stream().max(Comparator.comparingDouble(Book::getPrice));
    }

//    тут, впринципе, то же самое..
    public static Book highestPrice2(List<Book> list) {
        Optional<Book> mostExpensiveBook = list.stream()
                .max(Comparator.comparingDouble(Book::getPrice));
        mostExpensiveBook.ifPresent(book -> System.out.
                println("Самая дрогая книга это "+book.getTitle()+" автора "+book.getAuthor()+", её цена "+book.getPrice()));
        return mostExpensiveBook.orElse(null);
    }
}

