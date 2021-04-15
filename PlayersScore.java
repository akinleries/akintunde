package roughLectures;

public class PlayersScore {
    public static void main(String[] args) {
        calculateHighScorePosition(1500);
        System.out.println();
        displayHighScorePosition("THEO WALCOTT", 4);


    }

    public static void displayHighScorePosition(String playersName, int playersPosition){
        System.out.println(playersName + " " + "managed to get into position"  + " " +  playersPosition + " " + "on the high table");
    }

    public static int calculateHighScorePosition(int playerScore){

        if(playerScore > 1000){
            return  1;
        }
        else if (playerScore > 500 && playerScore < 1000){
            return 2;
        }
        else if (playerScore > 100 && playerScore < 500){
            return 3;
        }
        else {
            return 4;
        }

    }

}
