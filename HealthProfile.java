package GoodHealth;

import java.time.LocalDate;

    public class HealthProfile {
        private String firstName;
        private String lastName;
        private int dayOfBirth;
        private int monthOfBirth;
        private int yearOfBirth;
        private String gender;
        private int height;
        private int weight;


        public HealthProfile(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth, String gender, int height, int weight){
            this.firstName = firstName;
            this.lastName = lastName;
            this.dayOfBirth = dayOfBirth;
            this.monthOfBirth = monthOfBirth;
            this.yearOfBirth = yearOfBirth;
            this.gender = gender;
            this.height = height;
            this.weight = weight;

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
        public void setGender(String gender) { this.gender = gender; }
        public String getGender(){return gender; }
        public void setHeight(int height){this.height = height;}
        public int getHeight(){return height;}
        public void setWeight(int weight){this.weight = weight;}
        public int getWeight(){return weight;}

        public int getYearOfBirth() {
            return yearOfBirth;

        }

        public int bodyMassIndex(){
            int bodyMassIndex1 =  getHeight() * 730;
            int bodyMassIndex2 = getWeight() * getWeight();
            return bodyMassIndex1 / bodyMassIndex2;


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


