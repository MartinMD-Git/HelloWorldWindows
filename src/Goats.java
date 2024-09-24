import java.util.Scanner;

public class Goats {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1-10");
        Scanner input = new Scanner(System.in);
        int inputtedNum = input.nextInt();
        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck!");
        } else {
            System.out.println("Death to you and your family");
        }
    }
}




