package GPT_issue_next_level.students;
/*
Задача: Работа с коллекцией студентов

У вас есть список студентов, представленных в виде объектов Student.
Каждый объект Student имеет следующие атрибуты:
                                                name (имя студента, строка)
                                                age (возраст студента, целое число)
                                                score (средний балл студента, число с плавающей точкой)
Ваша задача:
 Создать список List<Student>, добавить в него несколько студентов.
1. Написать метод, который находит студента с наивысшим средним баллом.
2. Написать метод, который находит средний возраст всех студентов в списке.
3. Написать метод, который фильтрует студентов с баллом выше определенного порога
  (порог передается в качестве аргумента) и возвращает список отфильтрованных студентов.
4. Используя Stream API, написать метод, который находит и выводит имена всех студентов
   в алфавитном порядке.
5. Используя Stream API, написать метод, который находит и выводит имена всех студентов,
   чей возраст меньше 25 лет.
 */
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivanov", 35, 44.0);
        Student st2 = new Student("Petrov", 29, 25.1);
        Student st3 = new Student("Sidorov", 11, 34.6);
        Student st4 = new Student("Ivan'ko", 22, 37.5);
        Student st5 = new Student("Sinichkin", 42, 53.9);
        Student st6 = new Student("Skvorcova", 60, 45.0);
        Student st7 = new Student("Drozdov", 21, 50.6);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);

//        Iterator<Student> iterator = students.iterator();
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            iterator.remove();
//        }


//        System.out.println("Студент с наивысшим балом: "+biggestScore(students));
//        System.out.println(biggestScore2(students));
//        biggestScore3(students);
////        System.out.println(whoIsLooser(students));
//        System.out.println("Эти студеты имеют балл выше заданного: "+ naMedal(students,40));
////        System.out.println("Средний возраст группы: " + ageAverage(students));
//        System.out.println(group(students));


//        students.sort((s1,s2)->s1.getName().compareTo(s2.getName()));
//        for (Student student : students) {
//            System.out.println(student.getName()+" : "+student.getScore());
//        }

//        System.out.println(maloletki(students));

       List<Student> maloletki = students.stream().filter(s -> s.getAge() < 25).toList();
        for (Student student : maloletki) {
            System.out.println(student.getName()+" - возраст: "+student.getAge());
        }

    }
// 1. метод, который находит студента с наивысшим средним баллом

    public static Student biggestScore(List<Student> list) {
        Optional<Student> bestStudent = list.stream()
              .max(Comparator.comparing(Student::getScore));
//            .max((s1, s2) -> Double.compare(s1.getScore(), s2.getScore()));
        return bestStudent.orElse(null);
    }

    public static Optional<Student> biggestScore2(List<Student> list) {
        Optional<Student> bestStudent = list.stream()
                .max(Comparator.comparingDouble(Student::getScore));
//              .max(Comparator.comparingDouble(student -> student.getScore)
        return bestStudent;
    }

    public static void biggestScore3(List<Student> list) {
        System.out.println(list.stream().max(Comparator.comparingDouble(Student::getScore)));
//                                      .max(Comparator.comparingDouble(student -> student.getScore)
    }

    //  заодно найдём двоишника
    public static Student whoIsLooser(List<Student>list) {
        Optional<Student> looser = list.stream()
                .min(Comparator.comparing(Student::getScore));
//              .min((s1,s2)-> Double.compare(s1.getScore(),s2.getScore()));
//        if (looser.isPresent()) {
//            System.out.println("Худший студент: ");
//        }
            return looser.orElse(null);
    }

// 2. метод, который находит средний возраст всех студентов в списке.
    public static double ageAverage(List<Student>list) {
        if (list.isEmpty()) {
            return 0.0;
        }
        double totalAge = 0;
        for (Student student : list) {
            totalAge+= student.getAge();
        }
        return totalAge / list.size();
    }

//  Способ через Stream API
    public static Double ageAverage2(List<Student> list) {
        return list.stream().mapToInt(Student::getAge).average().orElse(0.0);
    }

//  возвр.знач. - void
    public static void ageAverage3(List<Student> list) {
        System.out.println(list.stream().mapToInt(Student::getAge).average().orElse(0.0));
    }


//  3. метод, который фильтрует студентов с баллом выше определенного порога
    public static List<String> naMedal(List<Student> list, int ball) {
        return list.stream().filter(st -> st.getScore() >= ball).map(Student::getName).toList();
    }

//  а тут мы ещё и фамилии отсортировали по алфавиту
    public static List<Student> naMedal2(List<Student> list) {
        return list.stream().filter(st -> st.getScore() >= 50)
                .sorted((s1,s2)->s1.getName().compareTo(s2.getName())).toList();
    }

    //  4.  метод, который находит и выводит имена всех студентов в алфавитном порядке.
    public static List<String> group(List<Student> list) {
        return list.stream().map(Student::getName).sorted().toList();
    }

    //  5. метод, который находит и выводит имена всех студентов, чей возраст меньше 25 лет.
    public static List<String> maloletki(List<Student> list) {
        return list.stream().filter(s -> s.getAge() < 25).map(Student::getName).toList();
    }
}
