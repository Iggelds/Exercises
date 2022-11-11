import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWithStreams {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(54, 231, 23, 56, 8, 89, 213, 56, 89);

        List<Integer> numWith8 = list.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("8")).map(e -> Integer.valueOf(e)).collect(Collectors.toList());
        System.out.println("numbers starts with 8: "+numWith8);
    }
}
