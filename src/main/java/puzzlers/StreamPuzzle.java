package puzzlers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class StreamPuzzle {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("milk");
        list.add("bread");
        Stream<String> stream = list.stream();
        list.add("fucking new string");
        stream.forEach(System.out::println);
    }
}
