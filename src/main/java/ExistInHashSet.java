import java.util.HashSet;

public class ExistInHashSet {
    public static void main(String[] args) {
        HashSet <Integer> hashSet = new HashSet<>();
        hashSet.add(658);
        hashSet.add(984);
        hashSet.add(567);
        hashSet.add(824);
        hashSet.add(369);

        if (hashSet.contains(824)){
            System.out.println("824 was found in the hashset");
        }
        else {
            System.out.println("824 was not found in the hashset");
        }
    }
}
