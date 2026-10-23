import java.util.Scanner;

public class Area {
   public static double CalculateArea(double radius){
        return Math.PI * radius * radius;
    }

    public static double CalculateCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double Radius;
        double Area;
        double Circumference;

        System.out.print("Enter the radius of the circle: ");
        Radius = input.nextDouble();
        Area= CalculateArea(Radius);
        Circumference =CalculateCircumference(Radius);

        System.out.println("\n--- Circle Information ---");
        System.out.println("Radius: " + Radius);
        System.out.println("Area: " + Area);
        System.out.println("Circumference: " + Circumference);

    }
}
