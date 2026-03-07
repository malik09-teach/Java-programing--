          package polymarphism;

//Interface
interface BankAccount {
 void deposit(double amount);
 void withdraw(double amount);
 double getBalance();
 void displayAccountInfo();
}

//Base class
abstract class Account implements BankAccount {
 protected double balance;
 protected String accountNumber;
 
 public Account(String accountNumber) {
     this.accountNumber = accountNumber;
     this.balance = 0;
 }
 
 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: $" + amount +"\n  new balance :"+balance +"$");
     }
 }
 
 @Override
 public abstract void withdraw(double amount);
 
 @Override
 public double getBalance() {
     return balance;
 }
 
 @Override
 public void displayAccountInfo() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: $" + balance);
 }
}

//Concrete classes
class SavingsAccount extends Account {
 private double interestRate;
 
 public SavingsAccount(String accountNumber, double interestRate) {
     super(accountNumber);
     this.interestRate = interestRate;
 }
 
 @Override
 public void withdraw(double amount) {
     if (amount > 0 && balance >= amount) {
         balance -= amount;
         System.out.println("Withdrew: $" + amount);
     } else {
         System.out.println("Insufficient funds!");
     }
 }
 
 public void addInterest() {
     double interest = balance * interestRate;
     deposit(interest);
 }
}

class CheckingAccount extends Account {
 private double overdraftLimit;
 
 public CheckingAccount(String accountNumber, double overdraftLimit) {
     super(accountNumber);
     this.overdraftLimit = overdraftLimit;
 }
 
 @Override
 public void withdraw(double amount) {
     if (amount > 0 && (balance - amount) >= -overdraftLimit) {
         balance -= amount;
         System.out.println("Withdrew: $" + amount);
     } else {
         System.out.println("Exceeds overdraft limit!");
     }
 }
}

//Main class demonstrating polymorphism
public class BankingSystem {
 public static void main(String[] args) {
     BankAccount[] accounts = new BankAccount[2];
     accounts[0] = new SavingsAccount("SAV001", 0.05);
     accounts[1] = new CheckingAccount("CHK001", 500);
     
     for (BankAccount account : accounts) {
         account.deposit(1000);
         account.withdraw(200);
         if (account instanceof SavingsAccount) {
             ((SavingsAccount) account).addInterest();
         }
         account.displayAccountInfo();
         System.out.println("-------------------");
     }
 }
}