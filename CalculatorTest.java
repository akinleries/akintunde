package ChapterFour;
import ChapterFour.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void startAllTest() {

        calculator = new Calculator();

    }

    @Test
    void addTwoNumbersTest() {


        assertEquals(5, calculator.add(3, 2));
        assertEquals(5, calculator.add(3, 2));
        assertEquals(7, calculator.add(5, 2));
        assertEquals(8, calculator.add(3, 5));

    }

    @Test
    @DisplayName("Testing for multiplication")
    void multiplyTwoNumbersTest() {


        assertEquals(4, calculator.multiply(2, 2));
        assertEquals(8, calculator.multiply(2, 4));
    }

    @Test
    @DisplayName("Two numbers can be divided")
    void divideTwoNumberTest() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(6, 3);

        assertEquals(2, result);
        assertEquals(3, calculator.divide(15, 5));
    }


    @Test
    @DisplayName("Testing for float return")
    void divisionByZeroTest() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.divide(5, 0));
    }

    @Test
    @DisplayName("Division by Zero return zero")
    void divideByZeroTest() {

        //Calculator calculator = new Calculator();
        assertEquals(2.5, calculator.divide(5, 2));
    }

    @Test
    void difference_canBeCalculated() {
        //Calculator calculator = new Calculator();
        assertEquals(-5, calculator.subtract(3,8));
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void difference_willProduceAbsoluteResult() {
        assertEquals(-5, calculator.subtract(5, 10));
    }

}