package GoodHealth;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HeartRate heartRate = new HeartRate("bessie", "jane", 23, 03,2012);

        System.out.println("Enter your First Name ");
        String firstName = scanner.next();
        heartRate.setFirstName(firstName);

        System.out.println("Enter your Last Name");
        String lastName = scanner.next();
        heartRate.setLastName(lastName);

        System.out.println("Enter your day of birth");
        int dayOfBirth = scanner.nextInt();
        heartRate.setDayOfBirth(dayOfBirth);

        System.out.println("Enter your month of birth");
        int monthOfBirth = scanner.nextInt();
        heartRate.setMonthOfBirth(monthOfBirth);

        System.out.println("enter year of birth");
        int yearOfBirth = scanner.nextInt();
        heartRate.setYearOfBirth(yearOfBirth);



       System.out.println("your Name is :  " + heartRate.getFirstName()+ "  " + heartRate.getLastName() + "\n");
        System.out.println("D-O-B : " + heartRate.getDayOfBirth()+ "/" + heartRate.getMonthOfBirth() + "/" + heartRate.getYearOfBirth() + "\n");
        System.out.println("Your age is : "  + heartRate.age() + "\n");
        System.out.println("Your maximum heart rate :  " + heartRate.maxHeartRate() + "\n");
        System.out.println("Your targeted heart :  " + heartRate.targetedHeartRate());

    }

}
