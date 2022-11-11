import java.util.Arrays;

public class CheckArraysEquals {
    public static void main(String[] args) {

        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 5};

        boolean status = true;

        if (a1.length == a2.length) {

            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    status = false;
                }
            }
        } else {
            status = false;
        }

        if (status == true) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

//        boolean status = Arrays.equals(a1,a2);
//
//        if(status==true) {
//            System.out.println("Arrays are equal");
//        }
//        else {
//            System.out.println("Arrays are not equal");
//        }
    }
}
