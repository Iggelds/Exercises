public class EvenAndOddFromArray {
    public static void main(String[] args) {

        int array[] = {1,2,3,4,5,6};

        System.out.print("Even numbers in array: ");
        for (int i=0; i< array.length; i++) {
            if(array[i]%2==0) {
                System.out.print(array[i]+" ");
            }
        }

//        for(int value : array) {
//            if(value%2==0) {
//                System.out.print(value);
//            }
//        }

        System.out.print("\n"+"Odd numbers in array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i]+" ");
            }
        }

//        for(int value : array) {
//            if(value%2!=0) {
//                System.out.print(value);
//            }
//        }
    }
}
