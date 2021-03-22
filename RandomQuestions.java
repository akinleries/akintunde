package ChapterFour;


import java.util.Scanner;

public class RandomQuestions {
    public static void main(String[] args) {

        int correctAnswerCount = 0;
        int wrongAnswerCount = 0;

        int count = 0;
        for (count = 1; count <= 10; count++){
            Scanner scanner = new Scanner(System.in);

            int number1 = (int)(Math.random() * 10 + 1);
            int number2 = (int)(1 + Math.random() * 10);

            int addNumbers  = number1 + number2;
            int subtractNumbers = number1 - number2;
            double divideNumbers = number1 / number2;
            int multiplyNumbers = number1 * number2;

            String  showAdditionOperator =  number1 + " + " + number2;
            String  showSubtractionOperator = number1 + " - "  + number2;
            String  showDivisionOperator = number1 + " / " + number2;
            String  showMultiplicationOperator = number1 + " * " + number2;

            int randomNumbers = (int) ( 1 + Math.random() * 4);

            switch (randomNumbers){

                case 1 :
                {
                    System.out.println("question " + count);
                    System.out.println(showAdditionOperator);
                    System.out.println("pls enter your answer");
                    int userInput = scanner.nextInt();
                    int answer = (userInput == addNumbers) ? correctAnswerCount++ : wrongAnswerCount++;

                }
                break;
                case 2:
                {
                    System.out.println("question " + count);
                    System.out.println(showSubtractionOperator);
                    System.out.println("pls enter your answer");
                    int userInput = scanner.nextInt();
                    int answer = (userInput == subtractNumbers) ? correctAnswerCount++ : wrongAnswerCount++;
                }
                break;
                case 3:
                {
                    System.out.println("question " + count);
                    System.out.println(showDivisionOperator);
                    System.out.println("pls enter your answer");
                    double userInput = scanner.nextDouble();
                    int answer = (userInput == divideNumbers) ? correctAnswerCount++ : wrongAnswerCount++;
                }
                break;
                case 4:
                {
                    System.out.println("question " + count);
                    System.out.println(showMultiplicationOperator);
                    System.out.println("pls enter your answer");
                    int userInput = scanner.nextInt();
                   int answer = (userInput == multiplyNumbers) ? correctAnswerCount++ : wrongAnswerCount++;
                }
                break;
            }

        }
        System.out.println("You scored " + correctAnswerCount + "/" + (correctAnswerCount + wrongAnswerCount));

    }
}
