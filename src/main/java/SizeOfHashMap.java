import java.util.HashMap;

public class SizeOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Coca-cola");
        hashMap.put(2, "Fanta");
        hashMap.put(3, "Pepsi");
        hashMap.put(4, "Sprite");
        hashMap.put(5, "7Up");

        System.out.println("Size of the given HashMap is: "+hashMap.size());
    }
}
