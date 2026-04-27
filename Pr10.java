class BankAccount {
String account_holder_name;
double balance;
static double interest_rate;

BankAccount(String name, double balance) {
    this.account_holder_name = name;
    this.balance = balance;
}

double calculateInterest() {
    return balance * interest_rate / 100;
}

void displayInterest() {
    System.out.println("Account Holder: " + account_holder_name);
    System.out.println("Balance: " + balance);
    System.out.println("Interest Earned: " + calculateInterest());
}

static void updateInterestRate(double rate) {
    interest_rate = rate;
}

}

public class Pr10 {
public static void main(String[] args) {
BankAccount.updateInterestRate(5);

    BankAccount a1 = new BankAccount("Rahul", 10000);
    BankAccount a2 = new BankAccount("Neha", 20000);

    a1.displayInterest();
    a2.displayInterest();

    BankAccount.updateInterestRate(7);

    a1.displayInterest();
    a2.displayInterest();
}

}