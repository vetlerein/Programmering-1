import java.util.Random;

public class MinRandom {
    private Random random;

    public MinRandom() {
        random = new Random();
    }

    public int nesteHeltall(int nedre, int ovre) {
        return random.nextInt(ovre - nedre) + nedre;
    }

    public double nesteDesimaltall(double nedre, double ovre) {
        return random.nextDouble() * (ovre - nedre) + nedre;
    }


    public static void main(String[] args) {
        MinRandom minRandom = new MinRandom();

        int heltall = minRandom.nesteHeltall(10, 20);
        System.out.println("Tilfeldig heltall mellom 10 og 20: " + heltall);

        double desimaltall = minRandom.nesteDesimaltall(0.5, 1.5);
        System.out.println("Tilfeldig desimaltall mellom 0.5 og 1.5: " + desimaltall);
    }
}
