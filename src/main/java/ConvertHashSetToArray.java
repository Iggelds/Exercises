import java.util.HashSet;

public class ConvertHashSetToArray {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Peach");
        fruits.add("Melon");
        fruits.add("Banana");
        fruits.add("Mango");

        String[] str = new String[fruits.size()];
        fruits.toArray(str);

        System.out.println("Array contains:");
        for (String string : str) {
            System.out.println(string);
        }
    }
}
