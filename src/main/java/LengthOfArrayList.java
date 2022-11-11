import java.util.ArrayList;

public class LengthOfArrayList {
    public static void main(String[] args) {

        ArrayList <String> cities = new ArrayList<>();

        System.out.println("size of ArrayList after creation: "+cities.size());

        cities.add("Wroclaw");
        cities.add("Poznan");
        cities.add("Krakow");

        System.out.println("size of ArrayList after adding elements: "+cities.size());

    }
}
