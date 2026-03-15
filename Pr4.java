import java.util.*;
public class Pr4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
     System.out.println("Enter weight in pounds = ");
    double weightp = s.nextDouble();
     System.out.println("Enter height in inches = ");
    double heighti = s.nextDouble();
    double h = 0.0254 * heighti ;
    double w = 0.45359237 * weightp;
    double bmi = (w/(h*h));
    System.out.println("your BMI is = " + bmi);
    }
}
