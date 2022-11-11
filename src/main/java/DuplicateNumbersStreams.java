import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbersStreams {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(54, 231, 23, 56, 8, 89, 213, 56, 89, 8, 54);
        Set<Integer> dup = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        System.out.println("duplicate numbers: " + dup);
    }
}
