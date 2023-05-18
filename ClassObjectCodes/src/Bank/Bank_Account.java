package Bank;

import java.util.Scanner;

class Account {
    String accountHolder;
    String accountNo;
    int initialBalance;

    void deposit(int amount) {
        initialBalance += amount;
    }

    void withdraw(int amount) {
        if (initialBalance >= amount ) {
            initialBalance -= amount;
        }
    }
}

public class Bank_Account {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter that amount that you wanna deposit : ");
        int deposit = scanner.nextInt();

        System.out.println("enter that amount that you wanna withdraw : ");
        int withdraw = scanner.nextInt();

        Account a = new Account();
        a.accountHolder = "abdurRahman";
        a.accountNo = "011202260";

        a.initialBalance = 1000;
        a.deposit(deposit);
        System.out.println(a.initialBalance);

        a.withdraw(withdraw);
        System.out.println(a.initialBalance);
    }
}
