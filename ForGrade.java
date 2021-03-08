import java.util.Scanner;

public class ForGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalScore = 0;
        int score = 0;
        int totalNumberOfInputCollected = 0;
        while (totalNumberOfInputCollected < 3) {

           System.out.print("enter your  numbers : ");
            score  = input.nextInt();
            totalScore = totalScore + score;
            totalNumberOfInputCollected++;

        }
       double average = totalScore/(totalNumberOfInputCollected * 1.0);
        System.out.println(average);
    }
}