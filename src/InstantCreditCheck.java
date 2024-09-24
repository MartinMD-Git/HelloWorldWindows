import java.util.Scanner;

public class InstantCreditCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salaray");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit sscore");
        int creditScore = scanner.nextInt();
        scanner.close();
        boolean qualified = isUserQualified(creditScore, salary);
    }

    public static boolean isUserQualified(int creditScore, double Salary){
        double requiredSalaray = 25000;
        int requiredCreditScore = 700;

        if(creditScore >= requiredCreditScore && Salary >= requiredSalaray){
        return true;
        } else {
        return false;
        }
    }
}
