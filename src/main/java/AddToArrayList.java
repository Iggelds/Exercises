import java.util.ArrayList;

public class AddToArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(118);
        list.add(12);
        list.add(89);
        list.add(201);

        System.out.println("ArrayList before adding: "+list);

        list.add(4, 96);
        System.out.println("ArrayList before adding 96: "+list);
    }
}
