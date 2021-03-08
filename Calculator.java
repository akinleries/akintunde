package ChapterFour;

public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }

    public int multiply(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;

    }
    public int subtract(int firstNumber, int secondNumber) {
        int result = 0;
        result = firstNumber - secondNumber;
        return result;
    }

    public double divide(int numerator, int denominator){
        if (denominator == 0){
            return 0;
        }
        return numerator/ (denominator*1.0);
    }
}
