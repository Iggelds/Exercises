import java.util.HashMap;

public class AddToHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 1);
        hashMap.put("Mike", 2);
        hashMap.put("Douglas", 3);
        hashMap.put("Kenny", 4);
        hashMap.put("Winnie", 5);

        System.out.println(hashMap);
    }
}
