public class BilerIGarage {
    public static void main(String[] args) {
        Garage minGarage = new Garage();

        Bil bil1 = new Bil("Rød", 25000, 10000, "Ferrari");
        Bil bil2= new Bil("Sort", 3980, 200000, "Lambo");

        minGarage.tilføjBil(bil1);
        minGarage.tilføjBil(bil2);

        int samletPris = minGarage.beregnPrisForAlleBiler();
        System.out.println("Den samlede pris er " + samletPris);
    }
}
