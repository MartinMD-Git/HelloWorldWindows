import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usersGuess = -1;
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) +1;
        System.out.println("Gæt et tal mellem 1 og 10:");
        int antalGæt = usersGuess;

        while (usersGuess != numberToGuess) {
            usersGuess = input.nextInt();
            antalGæt++;
            if (usersGuess > numberToGuess) {
                System.out.println("Tallet er mindre end dit gæt!");
            }
            else if (usersGuess < numberToGuess) {
                System.out.println("Tallet er større end dit gæt!");
            }
        }
        System.out.println("Du gættede rigtigt! Det tal jeg tænkte på var " +numberToGuess + ". Du brugte " +antalGæt + " forsøg");
    }
}
