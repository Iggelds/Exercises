import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(118);
        list.add(12);
        list.add(89);
        list.add(201);

//        for (int i=0; i< list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//
//        list.forEach((num -> {
//            System.out.println(num);
//        }));
    }
}
