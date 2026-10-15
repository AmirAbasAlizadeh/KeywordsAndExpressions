public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {

        getDuration(61,1);
        getDuration(3661);
        getDuration(-3954);
        getDuration(-45,50);
        getDuration(60, 250);
        
    }

    public static void getDuration(int seconds){

        if(seconds <= 0){
            System.out.println("Invalid value");
            return ;
        }
        int minutes = seconds / 60;
        int secs = seconds % 60;
        getDuration(minutes, secs);
    }

    public static void getDuration(int minutes, int seconds){

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Minutes or seconds or both values are invalid");
            return ;
        }
        int hours = minutes / 60;
        int minRemainder = minutes % 60;
        System.out.printf("%dH %dM %dS%n", hours, minRemainder, seconds);
    }
}
