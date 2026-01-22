package conditionalproblems;

public class Quadratic {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 2;

        int delta = b*b - 4*a*c;
        System.out.println("delta " + delta);

        double root1X = (-b + Math.sqrt(delta))/(2*a);
        double root2X = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("root1X " + root1X);
        System.out.println("root2X " + root2X);

    }
}
