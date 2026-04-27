public class Pr17 {

    static boolean isPassed(int mark) {
        return mark >= 40;
    }

    static String getDivision(double avg) {
        if (avg >= 60) return "First";
        else return "Second";
    }

    public static void main(String[] args) {
        int mark = 75;
        double average = 68.5;

        System.out.println(isPassed(mark));
        System.out.println(getDivision(average));
    }
}