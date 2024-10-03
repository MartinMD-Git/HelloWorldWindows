package Inhertiance;/*
    Følgende klasse repræsentere en nemkonto/basis konto.
    En særlig egenskab ved denne konto er at man kan have overtræk (10000 kr. for at være helt præcis).

    Ud fra vore klassediagram, så ved vi at den er en subklasse af Konto,
    men klassen mangler noget kode før at den kan nedarvede superklassens funktionalitet og egenskaber,
    og før at det bliver helt funktionsdygtig.
*/

// Først og fremmest skal vi bruge extend keyword og angive hvilken klasse NemKonto er subklasse til.
// Dette gøres i forlængelse af klassenavnet.
public class NemKonto extends Konto{
    /** ATTRIBUTES **/
    private double overtræk;

    /** CONSTRUCTOR **/
    // For at vi kan nedarve superklassens attributter og metoder, skal vi kalde på dens konstruktør vha keyword super().
    // Husk også at superklasse konstruktør forventer et argument, nemlig et kontonummer.
    public NemKonto(int kontonr) {

        super(kontonr);
        overtræk = 10000;
    }

    /** METHODS **/
    // Da NemKonto har en grænse for hvor meget overtræk er tilladt, overrider vi udbetal() fra super klassen
    // Husk override notation
    @Override
    public void udbetal(double sum) {

        // Tilskriv resultatet af udregningen getSaldo() - sum til variablen saldoEfterUdbetaling.
        double saldoEfterUdbetaling = getSaldo() - sum;
        // Den potentielle minusværdi som saldoEfterUdbetaling holder på skal tjekkes op imod det tilladte overtræk
        if (saldoEfterUdbetaling < -overtræk) {
            System.out.println("Udbetaling overstiger det tilladte");
            // Hvis udbetalingen overstiger det tilladte overtræk, så skriv en besked ud omkring det.
        } else {
            super.udbetal(sum);
            // Hvis udbetalingen ikke overstige, så skal der laves et kald til superklassens udbetal() metode sum.
            // For at kalde metoden i dette tilfælde, så brug super. foran metodenavnet, og husk at give sum med som argument.
        }

    }

    // Vi ønsker en anden tekst repræsentation for vores for vores NemKonto objekter
    // Husk override notation
    @Override
    public String toString() {
        // Returner en string der fortæller noget kort og sigende om objektet - inddrag gerne dets kontonummer og saldo.
        return "Dit kontonr er: " + getKontonummer() + " og din saldo er: " + getSaldo();
    }

}
