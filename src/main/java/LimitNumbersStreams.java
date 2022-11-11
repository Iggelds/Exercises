import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbersStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(54, 231, 23, 56, 8, 89, 213, 56, 89);

        List<Integer> limited = list.stream().limit(3).collect(Collectors.toList());
        System.out.println("list with limited numbers: "+limited);

        List<Integer> skipped = list.stream().skip(3).collect(Collectors.toList());
        System.out.println("list with skipped numbers: "+skipped);
    }
}
