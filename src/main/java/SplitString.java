public class SplitString {
    public static void main(String[] args) {

        String str = "Java, Selenium, Maven, TestNG, Jenkins";
        String [] result = str.split(",");
        for (int i=0; i<result.length; i++) {
            System.out.println(result[i].trim());
        }
    }
}
