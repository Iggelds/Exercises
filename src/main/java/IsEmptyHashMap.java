import java.util.HashMap;

public class IsEmptyHashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<>();

        System.out.println("Checking is HashMap empty? "+hashMap.isEmpty());

        hashMap.put(1, "Big");
        hashMap.put(2, "Small");
        hashMap.put(3, "Medium");

        System.out.println("Checking is HashMap empty? "+hashMap.isEmpty());
    }
}
