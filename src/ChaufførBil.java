public class ChaufførBil {
    public static void main(String[] args) {
        Bil minBil = new Bil("Blå", 500, 25000, "Porsche");
        Chauffør chauffør1 = new Chauffør("Abe");
        Chauffør chauffør2 = new Chauffør("Den anden abe");

        System.out.println(minBil.beskrivelse());

        if (minBil.enChaufførSætterSigInd(chauffør1)) {
            System.out.println(chauffør1.getNavn() + " er nu chaufføren");
        } else {
            System.out.println("Der er allerede en chauffør");
        }
        if (minBil.enChaufførSætterSigInd(chauffør2)) {
            System.out.println(chauffør2.getNavn() + " er chauffør");
        } else {
            System.out.println("Der er allerede en chauffør");
        }
        System.out.println("Den nuværende chauffør er " + minBil.hvemKørerBilen());

        Chauffør afgåendeChauffør = minBil.chaufførenStigerUd();
        if (afgåendeChauffør != null) {
            System.out.println(afgåendeChauffør.getNavn() + " er steget ud af bilen.");
        }

        if (minBil.enChaufførSætterSigInd(chauffør2)) {
            System.out.println(chauffør2.getNavn() + " er nu chaufføren.");
        } else {
            System.out.println("Der er allerede en chauffør i bilen.");

        }
    }
}
