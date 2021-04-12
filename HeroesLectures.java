package roughLectures;

public class HeroesLectures {
    public static void main(String[] args) {
        checkNumber(-3);
    }
        public static void checkNumber(int number) {
            if (number > 0)
                System.out.println("positive");
            else if (number < 0)
                System.out.println("Negative");
            else if(number == 0)
                    System.out.println("Zero");

        }

    }



