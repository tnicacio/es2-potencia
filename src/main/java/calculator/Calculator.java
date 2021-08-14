package calculator;

public class Calculator {

    public Calculator(){}

    public double potencia(int base, int exponent) {
        if (exponent < 0) {
            return 1 / potencyWithExponentNonNegative(base, -1 * exponent);
        }
        return potencyWithExponentNonNegative(base, exponent);
    }

    private double potencyWithExponentNonNegative(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * potencia(base, exponent - 1);
    }
}
