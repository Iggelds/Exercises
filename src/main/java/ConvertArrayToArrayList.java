import java.util.ArrayList;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        String[] cities = {"Warszawa", "Krakow", "Wroclaw", "Poznan", "Gdansk"};

//        ArrayList<String> list = new ArrayList<>(Arrays.asList(cities));
//        list.add("Katowice");
//        list.add("Lublin");
//        System.out.println(list);

        ArrayList<String> list = new ArrayList<>();

        for (int i=0; i< cities.length; i++) {
            list.add(cities[i]);
        }
        list.add("Katowice");
        list.add("Lublin");
        for (String str : list){
            System.out.println(str);
        }
    }
}
