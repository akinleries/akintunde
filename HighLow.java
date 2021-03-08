package ChapterFour;

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int smallestNumber = 2000;
        int largestNumber = 0;

        for (int counter = 1; counter <= 3; counter++) {
            System.out.println("enter your numbers");
            int number = input.nextInt();
            if (number > largestNumber)
                 largestNumber = number;


            if (number < smallestNumber)
                 smallestNumber = number;

        }

            System.out.println("smallest number is " + smallestNumber);
            System.out.println("largest number is " + largestNumber);


    }


}
