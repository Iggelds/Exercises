public class RemoveJunkAndWhitespaces {
    public static void main(String[] args) {

        String str = "    @#$@*$&@#$)* #$*_   string is normal   02319831   ";

        str = str.replaceAll("[^a-zA-z0-9]"," ");
        str = str.replaceAll("\\s","");

        System.out.println(str);
    }
}
