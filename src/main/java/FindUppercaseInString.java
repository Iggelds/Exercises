public class FindUppercaseInString {
    public static void main(String[] args) {
        String str = "Lets Find Uppercase LeTterS";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
}
