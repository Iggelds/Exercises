import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListAscending {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(32);
        list.add(78);
        list.add(99);
        list.add(13);

        System.out.println("ArrayList before sorting: "+list);

        Collections.sort(list);
        System.out.println("ArrayList after sorting: "+list);
    }
}
