public class BarkingDog {
    public static void main(String[] args) {
        boolean s1 = shouldWakeUp (true, 1); // Should return true
        System.out.println(s1);
        s1 = shouldWakeUp (true, 23); // Should return false
        System.out.println(s1);
        s1 = shouldWakeUp (true, 8); // Should return false
        System.out.println(s1);
        s1 = shouldWakeUp (true, -1); // Should return false
        System.out.println(s1);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }

        return (barking) && (hourOfDay < 8 || hourOfDay > 22);
    }
}
