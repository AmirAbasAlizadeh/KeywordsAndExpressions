public class AreaCalculator {
    public static void main(String[] args) {
        double generalArea = area(3.3);
        System.out.println(generalArea);
        generalArea = area(2.3,5.32);
        System.out.println(generalArea);
    }
    public static double area(double radius){

        if (radius < 0){
            return -1.0;
        }
        double result = (2 * radius) * Math.PI;
        return (double) Math.round(result * 1000.0) / 1000.0;
    }
    public static double area(double x, double y){

        if (x < 0 || y < 0){
            return -1.0;
        }
        return (double) Math.round ((x * y) * 1000.0) / 1000.0;
    }
}