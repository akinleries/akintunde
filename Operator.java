package ChapterFour;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        System.out.println("enter first number");
        number1 = input.nextInt();
        System.out.println("enter second number");
        number2 = input.nextInt();
        System.out.println("enter third number");
        number3 = input.nextInt();
        int addNum = number1 + number2 + number3;
        int subNum = number1 - number2 - number3;
        int mulNum = number1 * number2 * number3;
        double divNum = number1 / number2 / number3;
        System.out.println(addNum);
        System.out.println();
        System.out.println(subNum);
        System.out.println();
        System.out.println(mulNum);
        System.out.println();
        System.out.println(divNum);
    }

}
