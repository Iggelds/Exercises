import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(54, 231, 23, 56, 8, 89, 213, 56, 89);
        int max = list.stream().max(Comparator.comparing(e -> Integer.valueOf(e))).get();
        System.out.println("max value: "+max);
        int min = list.stream().min(Comparator.comparing(e -> Integer.valueOf(e))).get();
        System.out.println("min value: "+min);
    }
}
