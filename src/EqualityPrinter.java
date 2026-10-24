public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(2,4,3);
    }

    public static void printEqual(int num1, int num2, int num3){

        if (num1 < 0 || num2 <0 || num3 < 0){
            System.out.println("Invalid value");
        }
        else if (num1 == num2 && num1 == num3){
            System.out.println("All numbers are equal");
        }
        else if (num1 != num2 && num2 != num3 && num1 != num3){
            System.out.println("Neither of numbers are equal");
        }
        else {
            System.out.println("Neither all are equal nor all different");
        }
    }
}
