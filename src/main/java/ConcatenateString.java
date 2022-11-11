public class ConcatenateString {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "XYZ";
        String str3 = "PQR";

        String str = str1.concat(str2).concat(str3).toLowerCase();
        System.out.println(str);
    }
}
