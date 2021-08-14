package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void potenciaShouldReturnZeroWhenBaseIsZeroAndExponentIsPositive() {
        double result = calculator.potencia(0,2);
        assertEquals(0, result);
    }

    @Test
    void potenciaShouldReturnInfinityWhenBaseIsZeroAndExponentIsNegative() {
        double result = calculator.potencia(0, -2);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void potenciaShouldReturnOneWhenBaseIsNotZeroAndExponentIsZero() {
        double result = calculator.potencia(2, 0);
        assertEquals(1, result);
    }

    @Test
    void potenciaShouldReturnOneWhenBaseAndExponentAreZero() {
        double result = calculator.potencia(0, 0);
        assertEquals(1, result);
    }

    @Test
    void potenciaShouldReturnOneWhenBaseIsOneAndExponentIsPositive() {
        double result = calculator.potencia(1, 232);
        assertEquals(1, result);
    }

    @Test
    void potenciaShouldReturnOneWhenBaseIsOneAndExponentIsNegative() {
        double result = calculator.potencia(1, -232);
        assertEquals(1, result);
    }

    @Test
    void potenciaShouldReturnAPositiveNumberWhenBaseIsNegativeAndExponentIsEven() {
        double result = calculator.potencia(-2, 4);
        assertTrue(result > 0);
    }

    @Test
    void potenciaShouldReturnANegativeNumberWhenBaseIsNegativeAndExponentIsOdd() {
        double result = calculator.potencia(-2, 3);
        assertTrue(result < 0);
    }

    @Test
    void potenciaShouldReturnANumberGreaterThanZeroAndLessThanOneWhenBaseModulusIsGreaterThanOneAndExponentIsNegative() {
        double result = calculator.potencia(2, -2);
        assertTrue(result > 0);
        assertTrue(result < 1);
    }

    @Test
    void potenciaShouldReturnANumberGreaterThanOneWhenBaseBaseModulusIsGreaterThanOneAndExponentIsGreaterThanOne() {
        double result = calculator.potencia(2, 3);
        assertTrue(result > 1);
    }

}
