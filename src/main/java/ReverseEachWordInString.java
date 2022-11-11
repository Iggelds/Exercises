public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str = "Welcome To Java";
        String[] words = str.split(" ");
        String reversedstr = "";

        for (String w : words) {
            String reversedword = "";

            for (int i = w.length() - 1; i >= 0; i--) {
                reversedword = reversedword + w.charAt(i);
            }
            reversedstr = reversedstr+reversedword+" ";
        }

        System.out.println(reversedstr);
    }
}
