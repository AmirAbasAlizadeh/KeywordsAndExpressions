public class MinutesToDaysYears {
    public static void main(String[] args) {

        printYearsAndDays(1051200);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid value");
        }

        long years = minutes / (60 * 24 * 365);
        long remMinutes = minutes % (60 * 24 * 365);
        long days = remMinutes / (60 * 24);

        System.out.println(minutes + "mins: " + years + "years and " + days + "days");
    }
}
