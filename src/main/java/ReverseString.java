import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new string: ");
        String str = scanner.nextLine();
//        String str = "ABCD";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

//        char[] a = str.toCharArray();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + a[i];
//        }

//        StringBuffer stringBuffer = new StringBuffer(str);
//        StringBuffer rev = stringBuffer.reverse();

        System.out.println("The reversed string is " + rev);
    }
}
