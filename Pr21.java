class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}

class VotingApp {
    public void checkEligibility(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}

public class Pr21 {
    public static void main(String[] args) {
        VotingApp v = new VotingApp();

        int[] ages = {16, 18, 21};

        for (int age : ages) {
            try {
                System.out.println("Checking age: " + age);
                v.checkEligibility(age);
            } catch (AgeException e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                System.out.println("Validation process completed");
            }
        }
    }
}