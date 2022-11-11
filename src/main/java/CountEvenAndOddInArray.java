public class CountEvenAndOddInArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 7, 9, 10, 15};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("There are " + even + " even numbers in the array");
        System.out.println("There are " + odd + " odd numbers in the array");
    }
}
