import java.util.Arrays;
import java.util.List;

public class AvgOfNumbersStreams {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(54, 231, 23, 56, 8, 89, 213, 56, 89);
        double avg = list.stream().mapToInt(a -> a).average().getAsDouble();
        System.out.println("Average value: "+avg);
    }
}
