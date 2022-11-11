public class MaxAndMinInArray {
    public static void main (String[] args) {

        int a[] = {10,20,40,100,85,60};
//        int max = a[0];
//
//        for(int i=1; i<a.length; i++) {
//            if (a[i]>max) {
//                max = a[i];
//            }
//        }
//        System.out.println("Maximum number in array: "+max);

        int min = a[0];

        for(int i=1; i<a.length; i++) {
            if (a[i]<min) {
                min = a[i];
            }
        }
        System.out.println("Minimum number in array: "+min);
    }
}
