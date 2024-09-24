import java.util.Scanner;

public class Tommeberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Omregn fra tommer til centimeter");

        double tommer=input.nextDouble();

        final double TOMME_PER_CM=2.54;

        double tommerTilCm = tommer*TOMME_PER_CM;

        System.out.println(TOMME_PER_CM);

        System.out.println(tommer);

        System.out.println(tommer + " Tommer bliver omregnet til " + tommerTilCm + " cm");






    }
}
