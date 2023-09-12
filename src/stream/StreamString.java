package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamString {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("privet");
        ls.add("kak dela?");
        ls.add("ok");
        ls.add("poka");
        System.out.println(ls);

        String result = ls.stream().reduce((accumulator, element) -> accumulator +" "+ element).get();
        System.out.println(result);
    }
}
