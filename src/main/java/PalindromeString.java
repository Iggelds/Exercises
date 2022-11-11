import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new string: ");
        String str = scanner.nextLine();
        String org_str = str;
        String rev="";

        for (int i=str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("The reversed string is: "+rev);

        if(org_str.equals(rev)) {
            System.out.println(rev + " is Palindrome string");
        }
        else {
            System.out.println(rev + " is not Palindrome string");
        }
    }
}
