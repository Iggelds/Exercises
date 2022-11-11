import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Peach");
        fruits.add("Melon");
        fruits.add("Banana");
        fruits.add("Mango");

        String[] str = new String[fruits.size()];
        fruits.toArray(str);

        for (String string : str) {
            System.out.println(string);
        }
//        for (int i = 0; i < fruits.size(); i++) {
//            str[i] = fruits.get(i);
//            System.out.println(fruits.get(i));
//        }
    }
}

