/* Dette program beder brugeren skrive et heltal, og tjekker så om brugeren faktisk skriver et heltal.
 Hvis ikke det er tilfældet, så promptes brugeren igen, indtil inputtet er korrekt.


 OPGAVE 1: Læs koden igennem og forstå hvad den gør.
 Prøv så at køre programmet med både rigtigt og forkert input (skriv fx hej i stedet for et tal). */

import java.util.Scanner;

public class WhileLoopOpgave {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean okay;
        do {
            System.out.println("Enter a number as an integer: ");
            if (scanner.hasNextInt()) {
                okay = true;
            } else {
                okay = false;
                //nedenstående linje får scanneren til at "spise" det forkerte input, og er nødvendig for at komme videre
                scanner.next();
                System.out.println("You did not enter an integer.");
            }
        } while (!okay);
        int number = scanner.nextInt();
        System.out.println("Thank you!");


        /*OPGAVE 2 Udkommenter al koden der faktisk gør noget, dvs fra ovenover linjen hvor Scanneren bliver lavet,
         til nedenunder linjen der udskriver Thank you!. Udkommenter hele blokken på én gang, ikke linje for linje.
         Nu skal du selv skrive kode hvor du forsøger at lave do-while-loopet om til et while-loop. Der skal ikke gøres ret meget!
         Du må gerne starte med at kopiere al den kode du har udkommenteret, og så ændre i den.
         HINT: husk at boolean variablen okay skal være initialiseret inden den kan bruges, dvs assignet en værdi.*/

        //Skriv din kode herunder: ----------------------------------------------------------------------------------------------



            //------------------------------------------------------------------------------------------------------------------------
        }
        }
