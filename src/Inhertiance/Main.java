package Inhertiance;

public class Main {
    public static void main(String[] args) {


        Konto konto =new Konto(1);
        OpsparingsKonto opsparingsKonto = new OpsparingsKonto(2);
        NemKonto nemKonto = new NemKonto(3);

        konto.indbetal(100);
        opsparingsKonto.indbetal(500);
        nemKonto.indbetal(1000);

        System.out.println("Saldo for konto 1: " + konto.getSaldo());
        System.out.println("Saldo for konto 2: " + opsparingsKonto.getSaldo());
        System.out.println("Saldo for konto 3: " + nemKonto.getSaldo());

        opsparingsKonto.saldoEfterEtÅr();
        System.out.println("Saldo efter et år: ");
        System.out.println("Opsparingkonto: " + opsparingsKonto.getSaldo());

        // Lav tre objekter: et af typen Konto, et andet af typen OpsparingsKonto og et tredje af typen NemKonto.
        // Husk at angive et kontonummer til hver af dem

        // Udfork nu de forskellige objekter og hvad de kan.

        // Læs efterfølgende koden du har skrevet igennem, og reflekter over de muligheder, som arv giver i vores program design - både ift. til denne lille øvelse, men også ift. Adventure.

    }
}
