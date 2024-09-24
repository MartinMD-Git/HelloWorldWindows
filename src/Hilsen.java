public class Hilsen {

    public static void hej (String name){
        System.out.println("Hej " + name);

    }

    public static void main(String[] args) {
        hej("Martin");
        String anne = "Anne";
        hej(anne);
        //hej("Jonas");
        //hej("Daniel");

        String hilsen = hejReturner("Martin");
        System.out.println(hilsen);

    }
    public static String hejReturner(String name){
        return "Hej " + name;
}



}
