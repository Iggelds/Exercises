public class LinearSearch {
    public static void main(String[] args) {

        int a[] = {10, 20, 40, 50, 30};
        int search = 30;
        boolean flag = false;

        for (int i = 0; i < a.length; i++) {
            if (search == a[i]) {
                System.out.println("Element found at " + i + " index");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Element not found");
        }
    }
}
