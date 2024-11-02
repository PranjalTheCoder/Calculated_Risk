
public class ScientificCalculator extends Calculator {

    public double gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public double lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public double sin(double radians) {
        return Math.sin(radians);
    }

    public double cos(double radians) {
        return Math.cos(radians);
    }

    public double tan(double radians) {
        return Math.tan(radians);
    }

    public double sinDegrees(double degrees) {
        return sin(Math.toRadians(degrees));
    }

    public double cosDegrees(double degrees) {
        return cos(Math.toRadians(degrees));
    }

    public double tanDegrees(double degrees) {
        return tan(Math.toRadians(degrees));
    }
}