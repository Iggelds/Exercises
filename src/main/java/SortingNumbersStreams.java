import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNumbersStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(54, 231, 23, 56, 8, 89, 213, 56, 89);

        List<Integer> sortedAcs = list.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted numbers by ascending order: " + sortedAcs);

        List<Integer> sortedDesc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("sorted numbers by descending order: " + sortedDesc);
    }
}
