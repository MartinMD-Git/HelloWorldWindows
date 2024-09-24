import java.util.Scanner;
public class WhileLoopForLoopStars{}
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Hvor mange stjerner vil du udskrive?");
    int antalStjerner = scan.nextInt();
    int count = 0;
    for (int i=0; i < antalStjerner; i++) {
        System.out.print("*");
        count++;
    }
}