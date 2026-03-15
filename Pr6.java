import java.util.*;
class Rectangle {

    double width = 1;
    double height = 1;
    Rectangle() {
    }
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    double getArea() {
        return width * height;
    }

    
    double getPerimeter() {
        return 2 * (width + height);
    }
}
public class Pr6 {
    public static void main(String[] args) {
               Scanner s = new Scanner(System.in);

        System.out.print("Enter width of rectangle 1: ");
        double w = s.nextDouble();

        System.out.print("Enter height of rectangle 1: ");
        double h = s.nextDouble();

        Rectangle r = new Rectangle(w, h);

        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());

         System.out.print("Enter width of rectangle 2: ");
        double w1 = s.nextDouble();

        System.out.print("Enter height of rectangle 2: ");
        double h1 = s.nextDouble();

        Rectangle r1 = new Rectangle(w1, h1);

        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());
        
    }
}
