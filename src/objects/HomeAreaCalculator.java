public class HomeAreaCalculator {
    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30, 75 );
        double areaOfRoom2 = room2.calculateArea();
        System.out.println(areaOfRoom1);
    }
}
