public class CountCharacterOccurrence {
    public static void main(String[] args) {

        String str = "Java Programming java oops";

        char[] array = str.toCharArray();
        int count = 0;
        for (int i=0; i<array.length; i++){
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Number of occurrences of a character a: "+count);

//        int removeA = str.replace("a", "").length();
//        int count = str.length() - removeA;
//        System.out.println("Number of occurrences of a character a: "+count);
    }
}
