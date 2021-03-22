package GoodHealth;

import java.time.LocalDate;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;


    public HeartRate(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }



    public void setFirstName(String name){
        this.firstName = name;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String name){
        lastName = name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setDayOfBirth(int day){
        dayOfBirth = day;
    }
    public int getDayOfBirth(){
        return dayOfBirth;
    }
    public void setMonthOfBirth(int month){
        monthOfBirth = month;
    }
    public int getMonthOfBirth(){
        return monthOfBirth;
    }

    public void setYearOfBirth(int year) {
        this.yearOfBirth = year;
    }

    public int getYearOfBirth() {
        return yearOfBirth;

    }

   public int age(){
       LocalDate date = LocalDate.now();
       int thisYear = date.getYear();
       return thisYear - yearOfBirth;
   }
   public int maxHeartRate(){
       int maximumHeartRate = 220 - age();
     return  maximumHeartRate;
   }
   public String targetedHeartRate(){

      double target1 =  0.5 * (220 - age());
        double target2 = 0.85 * (220 - age());
        return target1 + " - " + target2;
   }
 }
