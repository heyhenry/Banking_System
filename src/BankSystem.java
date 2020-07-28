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

    public void menu() {

    }


}
