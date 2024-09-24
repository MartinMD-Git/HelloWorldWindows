import java.util.Scanner;

public class MånederOpgave {
    public enum Måneder {
        JANUARY(), FEBRUARY(), MARCH(), APRIL(), MAY(), JUNE(), JULY(), AUGUST(), SEPTEMBER(), OCTOBER(), NOVEMBER(), DECEMBER();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brugerValg= -1;
        System.out.println("Vælg en måned");
        while (brugerValg < 1 || brugerValg > 12) {
            System.out.println("Du må kun vælge mellem 1-12. Prøv igen.");
        }
       Måneder måneder = switch (brugerValg) {
            case 1 -> Måneder.JANUARY;
            case 2 -> Måneder.FEBRUARY;
            case 3 -> Måneder.MARCH;
            case 4 -> Måneder.APRIL;
            case 5 -> Måneder.MAY;
            case 6 -> Måneder.JUNE;
            case 7 -> Måneder.JULY;
            case 8 -> Måneder.AUGUST;
            case 9 -> Måneder.SEPTEMBER;
            case 10 -> Måneder.OCTOBER;
            case 11 -> Måneder.NOVEMBER;
            case 12 -> Måneder.DECEMBER;
            default -> null;
        };
        System.out.println(måneder);
        String årstid = switch (måneder) {
            case MARCH, APRIL, MAY -> "Det er forår";
            case JUNE, JULY, AUGUST -> "Det er sommer";
            case SEPTEMBER, OCTOBER, NOVEMBER -> "Det er efterår";
            case DECEMBER, JANUARY, FEBRUARY -> "Det er vinter";


        };
    }

}
