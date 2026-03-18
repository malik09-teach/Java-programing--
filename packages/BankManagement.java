package week_09;
//Outer Class
public class BankManagement {
 private String bankName = "Java National Bank (JNB)";

 // 1. Member Inner Class: Account
 class Account {
     private String accountHolder;
     private double balance;

     Account(String name, double initialDeposit) {
         this.accountHolder = name;
         this.balance = initialDeposit;
     }

     void deposit(double amount) {
         balance += amount;
         System.out.println("Deposited: " + amount + ". Current Balance: " + balance);
     }

     void withdraw(double amount) {
         if (amount > balance) {
             System.out.println("Insufficient balance!");
         } else {
             balance -= amount;
             System.out.println("Withdrew: " + amount + ". Remaining Balance: " + balance);
         }
     }

     void display() {
         System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
     }
 }

 // 2. Static Nested Class: BankPolicy
 static class BankPolicy {
     static int maxDailyWithdrawal = 50000;

     static void showPolicy() {
         System.out.println("Max Daily Withdrawal Limit: " + maxDailyWithdrawal);
     }
 }

 // 3. Local Inner Class: TransactionLog
 public void showTransactionLog() {
     String date = "2025-04-21";

     class TransactionLog {
         void showLog() {
             System.out.println("Transaction Log Date: " + date);
             System.out.println("Recent Transactions: Deposit 5000, Withdraw 2000");
         }
     }

     TransactionLog log = new TransactionLog();
     log.showLog();
 }

 // 4. Anonymous Inner Class: ATM
 interface ATM {
     void perform();
 }

 public void atmOperations() {
     ATM atm = new ATM() {
         @Override
         public void perform() {
             System.out.println("ATM Operation: Balance checked via anonymous class.");
         }
     };
     atm.perform();
 }

 // MAIN METHOD
 public static void main(String[] args) {
     System.out.println("=== Welcome to Java National Bank ===");

     BankManagement bank = new BankManagement();
    
     // Member Inner Class
     Account acc = bank.new Account("Ali Khan", 10000);
     acc.display();
     acc.deposit(5000);
     acc.withdraw(3000);

     // Static Nested Class
     BankPolicy.showPolicy();

     // Local Inner Class
     bank.showTransactionLog();

     // Anonymous Inner Class
     bank.atmOperations();
 }
}