import java.util.*;
public class Pr5 {
    public static void main(String[] args) {
    System.out.println("Enter 3 side lengths ofr triangle "); 
      Scanner s = new Scanner(System.in);
       System.out.println("Enter first side triangle (a) = ");
       double a =s.nextDouble();
        System.out.println("Enter second side triangle (b) = ");
        double b = s.nextDouble();
         System.out.println("Enter third side of triangle (c) = ");
      double c = s.nextDouble();
      
       if((a+b)>c){
        double x = ((a+b+c)/2);
        double area = Math.sqrt(x*(x-a)*(x-b)*(x-c));
       System.out.println("Area of triangle is = " + area);
       }
       else {
        System.out.println("invalid lenghts");
       }
    }
   
}
