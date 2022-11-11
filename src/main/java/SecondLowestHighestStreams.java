import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(54, 231, 23, 56, 8, 89, 213, 56, 89);

        int secH = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second highest number: "+secH);

        int secL = list.stream().sorted().skip(1).findFirst().get();
        System.out.println("second lowest number: "+secL);
    }
}
