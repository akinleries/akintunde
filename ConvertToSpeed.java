package roughLectures;

public class ConvertToSpeed {
    public static void main(String[] args) {
        executeMiles();

    }

    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        }
        long milesPerHour = Math.round(kilometerPerHour / 1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometerPerHour){
        if (kilometerPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + "km/H" + milesPerHour + "MI/H");
        }

    }
    public static void executeMiles(){
        double miles = ConvertToSpeed.toMilesPerHour(23.5);
        System.out.println("\n" + "Mile is =  " + miles + "\n");
        printConversion(2.5);
    }
}