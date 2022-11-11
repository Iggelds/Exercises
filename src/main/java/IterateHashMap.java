import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> fruits = new HashMap<>();

        fruits.put("Apple", 1);
        fruits.put("Peach", 2);
        fruits.put("Banana", 3);


        Iterator iterator = fruits.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            System.out.print(pair.getKey()+" ");
            System.out.println(pair.getValue());
        }
    }
}
