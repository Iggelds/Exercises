public class MissingNumberInArray {
    public static void main (String[] args) {
        int a[] = {1,2,3,4,5,6,8,9,10};
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<a.length; i++) {
            sum1 = sum1 + a[i];
        }
        System.out.println("Sum of elements in the array: "+sum1);

        for(int i=a[0]; i<= a[a.length-1]; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("Sum of range of elements in the array: "+sum2);

        System.out.println("Missing number is: "+(sum2-sum1));
    }
}
