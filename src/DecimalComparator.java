public class DecimalComparator {
    public static void main(String[] args) {
        boolean isEqual = areEqualByThreeDecimalPlaces(3.14345,-3.14366);
        System.out.println(isEqual);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        num1 = num1 * 1000;
        num2 = num2 * 1000;
        return (int)num1 == (int)num2;
    }

}
