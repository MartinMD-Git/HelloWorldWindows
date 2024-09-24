import java.util.Scanner;

public class TeaTime {
   public static void announceTeaTime() {
       System.out.println("Waiting for tea time");
       System.out.println("Type in a random word and press enter " + "to start tea time");
       Scanner input = new Scanner(System.in);
       input.next();
       System.out.println("It's tea time!");

   }

    public static void main(String[] args) {
        System.out.println("Welcome to your new job");
       announceTeaTime();
        System.out.println("Write code");
        System.out.println("review code");
        System.out.println("learn stuff");

        announceTeaTime();

        System.out.println("Get promoted");

    }
}
