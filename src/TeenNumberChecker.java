public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean teenChecker = hasTeen(22,23,34);
        System.out.println(teenChecker);
        boolean teen = isTeen(20);
        System.out.println(teen);
    }

    public static boolean hasTeen(int num1, int num2, int num3){

        if (num1 >= 13 && num1 <= 19){
            return true;
        }
        else if (num2 >= 13 && num2 <= 19){
            return true;
        }
        else if (num3 >= 13 && num3 <= 19){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int num){

        if (num >= 13 && num <= 19){
            return true;
        }
        return false;
    }
}
