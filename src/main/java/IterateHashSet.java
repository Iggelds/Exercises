import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Banana");
        fruits.add("Peach");
        fruits.add("Apple");
        fruits.add("Melon");
        fruits.add("Mango");

        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
