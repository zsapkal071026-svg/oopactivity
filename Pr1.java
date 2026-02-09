import java.util.*;
public class Pr1{
    public static void main(String[] args) {
        int distance;
        Scanner s = new Scanner(System.in);
        System.out.println("enter distance in meter = ");
        distance = s.nextInt();
        double d = distance * 3.28084;
        System.out.printf("the distance in feet = %.2f",d);
    }
}
