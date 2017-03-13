package puzzlers;


import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreateWaysExample {
    public static void main(String[] args) {

        //First way
        Stream stream = Stream.of("str1", "str2", "str3");
        //this part use Arrays.stream
        Stream intStream = Stream.of(new Integer[]{12, 78, 98, 90});


        IntStream.range(1, 4);
        //Second way
        Arrays.stream(new int[]{1, 2, 3});

        //Third way
        Stream streamBuilder = Stream.builder().add("a").add("b").add("c").build();

        //Fourth way
        Stream streamGenerated = Stream.generate(() -> "element").limit(10);
        streamGenerated.forEach(p -> System.out.println(p));


        //Fifth way
        Stream<?> iterate = Stream.iterate(10, n -> n * 2).limit(20); // n -> n+2 is UnaryOperator
        iterate.forEach(System.out::println);

    }
}
