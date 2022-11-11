import java.util.Arrays;
import java.util.List;

public class NumberSquareAverageStreams {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(54, 231, 23, 56, 8, 89, 213, 56, 89);

        double sqavg = list.stream().map(e -> e*e).filter(e -> e>100).mapToInt(e -> e).average().getAsDouble();
        System.out.println("number of square average: "+sqavg);
    }
}
