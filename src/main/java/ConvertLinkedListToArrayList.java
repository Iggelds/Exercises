import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertLinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Peach");
        fruits.add("Melon");
        fruits.add("Banana");
        fruits.add("Mango");

        List<String> list = new ArrayList<>(fruits);

        for(String s : list) {
            System.out.println(s);
        }
    }
}
