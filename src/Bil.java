public class Bil {
    private String farve;
    private String mærke;
    private int kørteKilometer;
    private double nyPris;
    private Chauffør chauffør;

public Bil(String farve, int kørteKilometer, double nyPris, String mærke) {
    this.farve = farve;
    this.mærke = mærke;
    this.kørteKilometer = kørteKilometer;
    this.nyPris = nyPris;
    this.chauffør = null;
}
public double getPris(){
    return nyPris;
}

public void kør(int antalKilometer){
if(antalKilometer > 0) {
    this.kørteKilometer += antalKilometer;
} else {
    System.out.println("Kørte kilometer skal være positive");
}

}
public double nyPris(){
    return this.nyPris;
}
public String beskrivelse(){
    return "Bilen koster " + nyPris() + ", den er farven " + farve + " og har kørt " + kørteKilometer;

}
public boolean enChaufførSætterSigInd(Chauffør c){
    if(this.chauffør == null){
        this.chauffør = c;
        return true;
    }
    return false;
}
public Chauffør hvemKørerBilen(){
    return this.chauffør;
}
    public Chauffør chaufførenStigerUd() {
        if (this.chauffør != null) {
            Chauffør afgåetChauffør = this.chauffør;
            this.chauffør = null; // Chaufføren forlader bilen
            return afgåetChauffør;
        } else {
            return null; // Ingen chauffør at fjerne
        }
    }
}




