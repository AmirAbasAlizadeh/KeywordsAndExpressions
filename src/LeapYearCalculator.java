public class LeapYearCalculator {
    public static void main(String[] args) {
        boolean year = isLeapYear(2020);
        System.out.println(year);
        year = isLeapYear(-1600);
        System.out.println(year);
        year = isLeapYear(1600);
        System.out.println(year);
        year = isLeapYear(2017);
        System.out.println(year);
        year = isLeapYear(2000);
        System.out.println(year);
    }
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
