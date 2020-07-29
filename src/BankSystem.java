import java.util.Scanner;

public class BankSystem {

    private double balance;
    private String id;
    private String name;

    public BankSystem(String id, String name, double balance) {

        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    public double checkBalance() {

        return balance;

    }

    public void deposit(double amount) {

        balance = balance + amount;

    }

    public void withdraw(double amount) {

        balance = balance - amount;

    }

    public void menu(BankSystem person) {

        Scanner sc = new Scanner(System.in);

        char choice;
        double amount;

        do {

            System.out.println("\nUnited Banking Systems\n");
            System.out.println("=============================");

            System.out.println("A - Check Balance");
            System.out.println("B - Deposit");
            System.out.println("C - Withdraw");
            System.out.println("D - Return Menu");
            System.out.println("X - End transaction");

            System.out.println("=============================");
            System.out.println("\nChoose an option provided on the menu: ");
            choice = sc.nextLine().charAt(0);

            switch(Character.toUpperCase(choice)) {

                case 'A' :

                    System.out.println("Checking Balance...");
                    System.out.println("Balance: $" + person.checkBalance());
                    break;

                case 'B' :

                    System.out.println("Enter deposit amount: ");
                    amount = Double.parseDouble(sc.nextLine());
                    System.out.println("Depositing...");
                    person.deposit(amount);
                    System.out.println("Deposited!");

                    break;

                case 'C' :

                    System.out.println("Enter withdraw amount: ");
                    amount = Double.parseDouble(sc.nextLine());
                    System.out.println("Withdrawing...");
                    person.withdraw(amount);
                    System.out.println("Withdrawn!");

                    break;

                case 'D' :

                    System.out.println("Returning to menu...");
                    break;

                case 'X' :

                    System.exit(0);

                default:

                    System.out.println("Invalid input! Returning to menu...");
                    break;

            }

        } while (Character.toUpperCase(choice) != 'X');


    }

    // TODO at a later date
    public String toString() {

        return "$" + balance;

    }


}
