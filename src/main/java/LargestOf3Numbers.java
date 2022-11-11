import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = scanner.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = scanner.nextInt();

        if (a>b && a>c) {
            System.out.println("The "+a+" is the largest number");
        }

        if (b>a && b>c) {
            System.out.println("The "+b+" is the largest number");
        }

        if (c>a && c>b) {
            System.out.println("The "+b+" is the largest number");
        }

//        int largest = a>b ? a:b;
//        largest = c>largest ? c:largest;
//        System.out.println("The "+largest+" is the largest number");
    }
}
