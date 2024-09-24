import java.util.ArrayList;

public class Garage {

    private ArrayList<Bil> bilerne = new ArrayList<Bil>();

        public void tilføjBil(Bil bil){
            bilerne.add(bil);




    }
    public int beregnPrisForAlleBiler(){
            int samletPris = 0;

            for(Bil bil : bilerne){
                samletPris += bil.getPris();
            }
            return samletPris;



    }

}
