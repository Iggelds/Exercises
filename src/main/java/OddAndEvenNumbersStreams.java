import org.junit.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddAndEvenNumbersStreams {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(54, 231, 23, 56, 8, 89, 213, 56, 89);

        List<Integer> evens = list.stream().filter(e -> e%2==0).collect(Collectors.toList());
        System.out.println("even numbers: "+evens);

        List<Integer> odds = list.stream().filter(e -> e%2!=0).collect(Collectors.toList());
        System.out.println("odd numbers: "+odds);
    }
}
