public class Main {
    public static void main(String[] args) {

        double centi = convertToCentimeters(15);
        System.out.println(centi);
        convertToCentimeters(6, 5);
    }
    public static double convertToCentimeters(int inches){
        return (double) inches * 2.54;
    }

    public static void convertToCentimeters(int feets, int inches){
        if (feets < 0 || inches < 0){
            System.out.println("Invalid value");
            return;
        }
        int allInches = ((feets * 12) + inches);
        System.out.println( allInches + " inches = " + convertToCentimeters(allInches) + " Centimeters");
    }
}