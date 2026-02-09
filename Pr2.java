import java.util.*;
public class Pr2 {
    public static void main(String[] args) {
        double a,b,c,d,e,f;
        double x,y,dx,dy;
         Scanner s = new Scanner(System.in);
         System.out.println("a = ");
         System.out.println("b = ");
         System.out.println("c = ");
         System.out.println("d = ");
         System.out.println("e = ");
         System.out.println("f = ");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        d = s.nextDouble();
        f = s.nextDouble();
        e = s.nextDouble();
        double D = a*d-b*c;
        dx = e*d-b*f;
        dy = a*f-c*e;
        x = dx/D;
        y = dy/D;
        System.out.println("x = " + x + "y = " + y);
    }
}
