public class SumOfArray {
    public static void main(String[] args) {

        int array[] = {5, 2, 7, 9, 6};
        int sum = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            sum = sum + array[i];
        }

//        for (int value : array) {
//            sum = sum + value;
//        }

        System.out.println("Sum of array elements is: " + sum);
    }
}
