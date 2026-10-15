
public class SpeedConverter {
    public static void main(String[] args) {

        double kilometerConverter = toMilesPerHour(75.114);
        System.out.println(kilometerConverter);

        printConversion(-75.114);

    }
    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0){
            return -1;
        }
        double milesPerHour = kilometersPerHour / 1.6 ;

        return Math.round(milesPerHour);
    }
    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0){
            System.out.println("Invalid value");
            return;
        }
        double milesPerHour = kilometersPerHour / 1.6 ;
        System.out.println(kilometersPerHour + " KM/H = " + Math.round(milesPerHour) + "MP/H");

    }
}
