public class EqualSumChecker {
    public static void main(String[] args) {
        boolean areEqual = hasEqualSum(4000000,1,4000001);
        System.out.println(areEqual);
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){

        int sumOfTwo = num1 + num2 ;
        return sumOfTwo == num3;
    }
}
