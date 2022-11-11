public class CountEvenAndOddDigits {
    public static void main (String[] args) {

        int num = 1234567890;
        int count_even = 0;
        int count_odd = 0;

        while(num!=0) {
            int rem = num % 10;

            if(rem%2==0) {
                count_even++;
            }
            else {
                count_odd++;
            }
            num = num/10;
        }
        System.out.println("There are "+count_even+" evens");
        System.out.println("There are "+count_odd+" odds");
    }
}
