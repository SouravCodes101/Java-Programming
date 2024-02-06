import java.util.*;

public class Circumference {
    public static double circumference(double radius) {
        double circumference = (2 * 3.14159 * radius);
        return circumference;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Circle to calculate corcumference in cm: ");
        int radius = sc.nextInt();
        System.out.println("The circumference of the circle is " + circumference(radius) + "cm. ");
    }
}
