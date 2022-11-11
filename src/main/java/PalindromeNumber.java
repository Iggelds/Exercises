import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new number: ");
        int num = scanner.nextInt();

        int org_num = num;
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println("The reversed number is: " + rev);

        if (org_num == rev) {
            System.out.println(rev + " is Palindrome number");
        } else {
            System.out.println(rev + " is not Palindrome number");
        }
    }
}
