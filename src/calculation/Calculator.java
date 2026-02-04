package calculation;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("ไม่สามารถหารด้วยศูนย์ได้");
        }
        return a / b;
    }

    public double percent(double a) {
        return a / 100;
    }
}