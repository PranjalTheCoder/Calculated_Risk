import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        // Example usage
        System.out.println("Basic Calculator:");
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(5, 3));
        
        System.out.println("\nCalculation History:");
        for (String entry : calculator.getHistory()) {
            System.out.println(entry);
        }

        // Scientific calculations
        System.out.println("\nScientific Calculator:");
        System.out.println("GCD of 48 and 18: " + scientificCalculator.gcd(48, 18));
        System.out.println("LCM of 4 and 5: " + scientificCalculator.lcm(4, 5));
        System.out.println("Sin(30 degrees): " + scientificCalculator.sinDegrees(30));
    }
}