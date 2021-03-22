package GoodHealth;


import java.util.Scanner;

public class HealthProfileTest {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            HealthProfile healthProfile = new HealthProfile("bessie", "jane", 23, 03,2012, "male", 50, 23 );

            System.out.println("Enter your First Name ");
            String firstName = scanner.next();
            healthProfile.setFirstName(firstName);

            System.out.println("Enter your Last Name");
            String lastName = scanner.next();
            healthProfile.setLastName(lastName);

            System.out.println("Enter your day of birth");
            int dayOfBirth = scanner.nextInt();
            healthProfile.setDayOfBirth(dayOfBirth);

            System.out.println("Enter your month of birth");
            int monthOfBirth = scanner.nextInt();
            healthProfile.setMonthOfBirth(monthOfBirth);

            System.out.println("Enter year of birth");
            int yearOfBirth = scanner.nextInt();
           healthProfile.setYearOfBirth(yearOfBirth);

            System.out.println("Enter your gender pls");
            String gender = scanner.next();
            healthProfile.setGender(gender);

            System.out.println("Enter your height");
            int height = scanner.nextInt();
            healthProfile.setHeight(height);

            System.out.println("Enter your weight");
            int weight = scanner.nextInt();
            healthProfile.setWeight(weight);



            System.out.println("Your Name is :  " + healthProfile.getFirstName()+ "  " + healthProfile.getLastName() + "\n");
            System.out.println("D-O-B : " + healthProfile.getDayOfBirth()  + "/" + healthProfile.getMonthOfBirth() + "/" + healthProfile.getYearOfBirth() + "\n");
            System.out.println("Your age is : "  + healthProfile.age() + "\n");
            System.out.println("BMI : " + healthProfile.bodyMassIndex() + "\n");
            System.out.println("Gender : " + healthProfile.getGender() + "\n");
            System.out.println("Height : " + healthProfile.getHeight() + "-inches" + "\n");
            System.out.println("Weight : " + healthProfile.getWeight() + "-pounds" + "\n");
            System.out.println("Your maximum heart rate :  " + healthProfile.maxHeartRate() + "\n");
            System.out.println("Your targeted heart :  " + healthProfile.targetedHeartRate());

        }

    }



