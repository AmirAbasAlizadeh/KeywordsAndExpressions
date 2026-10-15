public class Methods {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        calculateScore(true, 1000, 5, 100);
        calculateScore(true, score, levelCompleted, bonus);
        calculateScore(false, 1000, 5, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        } else {
            System.out.println("Your game is not over!");
        }
    }
}
