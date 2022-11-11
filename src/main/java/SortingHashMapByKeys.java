import java.util.*;

public class SortingHashMapByKeys {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        Iterator iterator1 = map.entrySet().iterator();

        System.out.println("Before sorting:");
        while(iterator1.hasNext()){
            Map.Entry pair = (Map.Entry)iterator1.next();
            System.out.print(pair.getKey()+" ");
            System.out.println(pair.getValue());
        }
        TreeMap<String,Integer> sorted = new TreeMap<>(map);
        Iterator iterator2 = sorted.entrySet().iterator();
        System.out.println("After sorting: ");
        while(iterator2.hasNext()){
            Map.Entry pair = (Map.Entry)iterator2.next();
            System.out.print(pair.getKey()+" ");
            System.out.println(pair.getValue());
        }

    }
}

