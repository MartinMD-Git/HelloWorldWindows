public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15,  8,  15,  8,  17);
        Triangle triangleB = new Triangle(3, 2.5, 3, 3, 3);
        Cirkel cirkel1 = new Cirkel(5.0);
        System.out.println("Arealet af cirklen er: " + cirkel1.cirkelAreal());
    }
}
