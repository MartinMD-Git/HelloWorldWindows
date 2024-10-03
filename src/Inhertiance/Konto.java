package Inhertiance;/*
    Følgende klasse repræsentere en bankkonto.
    I vores program er denne klasse vores super klasse, som de to andre klasser NemKonto og OpsparingsKonto arver fra.
    OpsparingsKonto og NemKonto er altså subklasser af Konto.

    Denne klasse er allerede udfyldt for dig, men brug lidt tid på at forstå dens attributes og metoder.
*/


public class Konto {
    /** ATTRIBUTES **/
    // En konto har en saldo og et kontonummer

    protected double saldo;
    protected int kontonummer;

    /** CONSTRUCTOR **/
    // Når en konto oprettes har den en saldo på 0.0 og den får tildelt et kontonummer

    public Konto(int kontonummer) {
        saldo = 0.0;
        this.kontonummer = kontonummer;
    }

    /** METHODS **/
    // Det er muligt at indbetale penge på kontoen, udbetale penge fra kontoen, og få indblik i kontoens saldo og kontonummer (getter)

    public void indbetal(double sum) {
        if (sum > 0) {
            saldo += sum;
        } else {
            System.out.println("Du kan ikke indbetale et negativt beløb.");
        }
    }

    public void udbetal(double sum) {
        if (sum > 0) {
            saldo -= sum;
        } else {
            System.out.println("Du kan ikke få udbetalt et negativt beløb.");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    @Override
    public String toString() {
        return "Kontonr.: " + kontonummer + ", Saldo: " + getSaldo();
    }
}
