package puzzlers;


import java.util.ArrayList;
import java.util.List;

public class ListAddInterviewTask {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Long number = 1L;
        list.add(1);
        list.add(3);
        list.add(4);
        list.remove(number);
        list.forEach(System.out::println);

    }
}
