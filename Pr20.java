public class Pr20 {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide two arguments");
            }

            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Numerator 1: " + numerator);
            System.out.println("Denominator 2: " + denominator);
            System.out.println("Result 3: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error 4: Division by zero is not allowed");
        } catch (NumberFormatException e) {
            System.out.println("Error 5: Please enter valid integers");
        } catch (IllegalArgumentException e) {
            System.out.println("Error 6: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error 7: Unexpected error occurred");
        } finally {
            System.out.println("Program executed 8");
        }
    }
}