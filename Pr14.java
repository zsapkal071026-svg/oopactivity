class BankAccount {
int accountNumber;
String accountHolderName;
double balance;

BankAccount(int accNo, String name, double balance) {
    this.accountNumber = accNo;
    this.accountHolderName = name;
    this.balance = balance;
}

void openAccount() {
    System.out.println("Account opened for " + accountHolderName);
}

void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited: " + amount);
}

void withdraw(double amount) {
    if (amount <= balance) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    } else {
        System.out.println("Insufficient balance");
    }
}

void checkBalance() {
    System.out.println("Balance: " + balance);
}

}

class SavingAccount extends BankAccount {
double interestRate = 5;

SavingAccount(int accNo, String name, double balance) {
    super(accNo, name, balance);
}

double calculateInterest() {
    return balance * interestRate / 100;
}

}

class FixedDepositAccount extends BankAccount {
int years;
double rate = 7;

FixedDepositAccount(int accNo, String name, double balance, int years) {
    super(accNo, name, balance);
    this.years = years;
}

double maturityAmount() {
    return balance + (balance * rate * years / 100);
}

}

public class Pr14 {
public static void main(String[] args) {
SavingAccount sa = new SavingAccount(101, "Rahul", 10000);
FixedDepositAccount fd = new FixedDepositAccount(102, "Neha", 20000, 2);

    sa.openAccount();
    sa.deposit(2000);
    sa.withdraw(1500);
    sa.checkBalance();
    System.out.println("Savings Interest: " + sa.calculateInterest());

    fd.openAccount();
    fd.deposit(5000);
     fd.checkBalance();
    System.out.println("Maturity Amount: " + fd.maturityAmount());
}

}