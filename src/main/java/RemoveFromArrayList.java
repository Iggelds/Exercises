import java.util.ArrayList;

public class RemoveFromArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(118);
        list.add(12);
        list.add(89);
        list.add(201);

        System.out.println("ArrayList before removing: "+list);

        list.remove(0);
        System.out.println("ArrayList before removing 42: "+list);
    }
}
