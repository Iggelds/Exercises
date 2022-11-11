import java.util.HashSet;

public class DuplicateElementsInArray {
    public static void main(String[] args) {

        String arr[] = {"java", "C", "C++", "Python", "C"};
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Found duplicate element: " + arr[i]);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("There are no duplicate elements");
        }

//        HashSet<String> set = new HashSet<>();
//        for (String duplicate : arr) {
//            if (set.add(duplicate) == false) {
//                System.out.println("Found duplicate element: " + duplicate);
//                flag = true;
//            }
//        }
//                if (flag == false) {
//            System.out.println("There are no duplicate elements");
//        }
    }
}
