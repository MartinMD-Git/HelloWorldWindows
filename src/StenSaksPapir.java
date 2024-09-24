import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int brugerPoint = 0;
        int computerPoint = 0;



        Random random = new Random();


        while (brugerPoint < 2 && computerPoint < 2) {
            System.out.println("Vælg sten, saks eller papir");
            String brugerValg = scanner.nextLine().toLowerCase();


            int computerValgTal = random.nextInt(3);
            String computerValg = "";

            if (computerValgTal == 0) {
                computerValg = "sten";
            } else if (computerValgTal == 1) {
                computerValg = "saks";
            } else {
                computerValg = "papir";
            }

            System.out.println("Du valgte " + brugerValg + " og computeren valgte " +computerValg );

            if (brugerValg.equals(computerValg)) {
                System.out.println("Det blev uafgjort");
            } else if (brugerValg.equals("sten") && computerValg.equals("saks") ||
                    brugerValg.equals("saks") && computerValg.equals("papir") ||
                    brugerValg.equals("papir") && computerValg.equals("sten")) {
                System.out.println("Du vinder denne runde");
                brugerPoint++;
            } else {
                System.out.println("Computeren vinder");
                computerPoint++;
            }
            System.out.println("Du har nu " + brugerPoint + " og computeren har " + computerPoint);

        }
        if (brugerPoint == 2) {
            System.out.println("Du vandt spillet!");
        } else {
            System.out.println("Computeren vandt spillet!");
        }
    }
}
