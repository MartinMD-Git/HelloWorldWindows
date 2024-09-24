import java.util.Scanner;

public class BMIBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hej, dette er en BMI-beregner. Indtast din højde i centimeter og derefter din vægt i kg");

        double højde = input.nextDouble();

        double vægtIKg = input.nextDouble();

        double BMI = vægtIKg / (højde * højde);
        System.out.println("Din BMI er: " + BMI);




    }
}
