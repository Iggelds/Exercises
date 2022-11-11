import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

//        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));
//        StringBuffer reverse = stringBuffer.reverse();

//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(number);
//        StringBuilder reverse = stringBuilder.reverse();

        System.out.println("The reverse number is: " + reverse);
    }
}
