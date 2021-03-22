package chapterFive;

public class NewKata {

    public static int getSumOfNumbers(int[] arrays) {
        int sumNumbers = 0;

        for (int count = 0; count < arrays.length; count++) {

            sumNumbers += arrays[count];
        }
        return sumNumbers;


    }

    public static int averageNumbers(int[] arrays) {
        return getSumOfNumbers(arrays) / arrays.length;
    }

    public static int maximumNumbers(int[] arrays) {
        int maxNumber = 0;
        maxNumber = arrays[0];
        for (int count = 0; count < arrays.length; count++) {
            if (maxNumber < arrays[count]) {
                maxNumber = arrays[count];
            }
        }
        return maxNumber;
    }

    public static int minimumNumbers(int[] arrays) {
        int minimumNumbers = 0;
        minimumNumbers = arrays[0];
        for (int count = 0; count < arrays.length; count++) {
            if (minimumNumbers > arrays[count]) {
                minimumNumbers = arrays[count];
            }

        }
        return minimumNumbers;
    }

    public static int sumMinimumNumbers(int[] arrays) {
       int minimumumSum = getSumOfNumbers(arrays) - minimumNumbers(arrays);
       return minimumumSum;
    }

    public static int sumMaximumNumbers(int[] arrays) {
        int maximumSum = getSumOfNumbers(arrays) - maximumNumbers(arrays);
        return maximumSum;
    }
}
