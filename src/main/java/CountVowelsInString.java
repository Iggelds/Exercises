public class CountVowelsInString {
    public static void main(String[] args) {

        String str = "wElcome tO AutomatIon";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if (ch == 'e' ||
                    ch == 'y' ||
                    ch == 'u' ||
                    ch == 'i' ||
                    ch == 'o' ||
                    ch == 'a')
                count++;
        }
        System.out.println("There number of Vowels in the string: " + count);
    }
}


