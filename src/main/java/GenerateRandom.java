import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int = rand.nextInt(100);
        System.out.println(rand_int);

        double rand_dbl = rand.nextDouble();
        System.out.println(rand_dbl);
    }
}
