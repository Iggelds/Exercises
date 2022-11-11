import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class IterateTreeMap {
    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        Iterator iterator = treeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.print(pair.getKey()+" ");
            System.out.println(pair.getValue()+" ");
        }
    }
}
