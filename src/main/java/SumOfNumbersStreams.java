import com.sun.source.tree.AssertTree;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbersStreams {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(54, 231, 23, 56, 8, 89, 213, 56, 89);
        int sum = list.stream().mapToInt(s -> s).sum();
        System.out.println("Sum of numbers: " + sum);

//        Integer sum2 = list.stream().reduce((a, b) -> a+b).get();
//        System.out.println("Sum of numbers: " + sum2);
    }
}
