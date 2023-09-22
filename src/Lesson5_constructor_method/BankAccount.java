package Lesson5_constructor_method;

import com.sun.source.tree.YieldTree;

public class BankAccount {
    int id;
    String name;
    double balance;

}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Zaur";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "David";
        YourAccount.balance = 5.75;

        HisAccount.id = 3;
        HisAccount.name = "Mike";
        HisAccount.balance = 13.75;

        System.out.println();


    }
}
