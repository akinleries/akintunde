package ChapterFour;

import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number");
        int userNumber = input.nextInt();

        for (int numberCounter = 1; numberCounter <= userNumber; numberCounter++) {

            if (userNumber % numberCounter == 0) {
                System.out.println(numberCounter);

            }

        }
    }
}