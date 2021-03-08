package ChapterFour;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner userInputCollector = new Scanner(System.in);
        String prompt = """
                
                Hello user,
                welcome to lasu Calculator.
                -> Enter 1 for addition.
                -> Enter 2 for absolute subtraction.
                -> Enter 3 for multiplication.
                -> Enter 4 for Division.
                 """;
        System.out.println(prompt);
        int userChoice = userInputCollector.nextInt();
        System.out.println("Enter first number");
        int firstNumber = userInputCollector.nextInt();
        System.out.println("Enter second number");
        int secondNumber = userInputCollector.nextInt();
        switch (userChoice){

            case 1 -> System.out.println(calculator.add(firstNumber, secondNumber));
            case 2 -> System.out.println(calculator.subtract(firstNumber, secondNumber));
            case 3 -> System.out.println(calculator.multiply(firstNumber, secondNumber));
            case 4 -> System.out.println(calculator.divide(firstNumber, secondNumber));
            default -> System.out.println("pls choose something reasonable");
        }


    }
}
