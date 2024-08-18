package codsoft;
import java.util.*;
class ATM {
    private BankAccount account;
    public ATM(BankAccount account) {
        this.account = account;
    }
    public void showMenu() {
        Scanner obj = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\nwelcome to ATM");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Please select an option from the  above ☝️:");
            choice = obj.nextInt();
            if (choice == 1) {
                checkBalance();
            } else if (choice == 2) {
                deposit(obj);
            } else if (choice == 3) {
                withdraw(obj);
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM. Goodbye!");
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
    private void checkBalance() {
        System.out.println("Your current balance is " + account.checkBalance()+" "+"Rs/-");
    }
    private void deposit(Scanner obj) {
        System.out.print("Enter the amount to deposit: ");
        double amount = obj.nextDouble();
        account.deposit(amount);
    }
    private void withdraw(Scanner obj) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = obj.nextDouble();
        account.withdraw(amount);
    }
}

