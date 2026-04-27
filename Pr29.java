import java.util.*;

public class Pr29 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(82);
        marks.add(90);
        marks.add(68);
        marks.add(88);

        System.out.println("All Marks: " + marks);
        System.out.println("Highest Marks: " + Collections.max(marks));
        System.out.println("Lowest Marks: " + Collections.min(marks));
    }
}