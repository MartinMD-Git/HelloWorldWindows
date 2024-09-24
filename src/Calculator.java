public class Calculator {

    public double add(double a, double b){
        return a+b;
    }
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(String a, String b){
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return num1+num2;
    }
    public double multiply(double a, double b){
        return a * b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        return a / b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("To doubles: " + calc.add(1.5,2.3));
        System.out.println("To ints: " + calc.add(5,9));
        System.out.println("Tre ints: " + calc.add(5,9, 100));
        System.out.println("To strings: " + calc.add("100", "500"));

        System.out.println("Multiplikation af to ints: " + calc.multiply(5,9));
        System.out.println("Multiplikation af to doubles: " + calc.multiply(5.5,9.3));

        System.out.println("Division af to ints: " + calc.divide(5,9));

}


}
