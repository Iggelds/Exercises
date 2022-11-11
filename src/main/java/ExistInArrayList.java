import java.util.ArrayList;

public class ExistInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(23);
        list.add(68);
        list.add(79);
        list.add(86);

        if (list.contains(68)) {
            System.out.println("68 was found in the list");
        }
        else {
            System.out.println("68 was not found in the list");
        }
    }
}
