import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean okay = false;
    while (!okay) {
        System.out.println("Enter a number as an integer: ");
        if (scanner.hasNextInt()) {
            okay = true;
        } else {
            okay = false;
            scanner.next();
            System.out.println("You did not enter an integer.");
        }
    }
    int number = scanner.nextInt();
    System.out.println("Thank you!");
    {
    }
}