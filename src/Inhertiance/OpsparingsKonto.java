package Inhertiance;/*
    Følgende klasse repræsentere en opsparingskonto.
    En særlig egenskab ved denne konto er at indestående (saldoen) stiger med en årlig rente på 1.5%.

    Ud fra vore klassediagram, så ved vi at den er en subklasse af Konto,
    men ligesom NemKonto så mangler klassen noget kode før at den kan nedarvede superklassens funktionalitet og egenskaber,
    og før at det bliver helt funktionsdygtig.

    Til denne klasse er der færre kommentarer, så brug den viden du fik fra at lave NemKonto, samt dagens forberedelse.
*/

public class OpsparingsKonto extends Konto{
    /** ATTRIBUTES **/
    private double årligRente;

    /** CONSTRUCTOR **/
    public OpsparingsKonto(int kontonr) {
        super(kontonr);
        årligRente = 1.5;

    }

    /** METHODS **/
    // Følgende metode kaldes når der er gået et år - ja, det er en ret simpel opsparingskonto, hvor man ligger penge ind i starten af året og så får man udbetalt renter sidst på året.
    public void saldoEfterEtÅr() {
        double saldoMedRente = getSaldo() * (årligRente / 100);
        // Brug den nedarvede indbetal() og giv den saldoMedRente som argument.
        indbetal(saldoMedRente);

        System.out.println("Et år er gået.\nMed en nuværende saldo på " + (getSaldo() - saldoMedRente) + " kr. og en årlig rente på " + årligRente + "% er din saldo steget til " + getSaldo() + " kr.");
    }

    // Husk override notation
    public String toString() {
        // Og ligesom med NemKonto, returner en string der fortæller noget kort og sigende om objektet.
        return "Dit kontonummer er: " + getKontonummer() + " og din saldo er: " + getSaldo();
    }
}
