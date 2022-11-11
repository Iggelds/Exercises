import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SortingArrayListDescending {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(54);
//        list.add(32);
//        list.add(78);
//        list.add(99);
//        list.add(13);

        ArrayList<String> list = new ArrayList<>();

        list.add("Banana");
        list.add("Peach");
        list.add("Apple");
        list.add("Melon");
        list.add("Mango");

        System.out.println("ArrayList before sorting: "+list);

        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("ArrayList after sorting: "+list);
    }
}
