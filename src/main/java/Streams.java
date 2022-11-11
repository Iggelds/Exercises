import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main (String[] args) throws IOException {
        System.out.println(
        IntStream
                .range(1,10)
//                .skip(5)
                .sum());
//                .forEach(x -> System.out.println(x));
//                .forEach(System.out::print);
        System.out.println();

        Stream.of("Anna", "Alberto", "Emilia")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        String [] names = {"Alice", "Anna", "Brent", "Alberto", "Amanda", "Douglas", "Sven"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("A"))
                .sorted()
                .forEach(System.out::println);

        Arrays.stream(new int[] {2,4,6,8,10})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);

        List<String> people = Arrays.asList("Alice", "Anna", "Brent", "Alberto", "Amanda", "Douglas", "Sven");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("d"))
                .forEach(System.out::println);

        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a+b);
        System.out.println("Total = " + total);
    }
}
