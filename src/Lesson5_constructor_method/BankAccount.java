package Lesson5_constructor_method;

import com.sun.source.tree.YieldTree;

public class BankAccount {
    int id;
    String name;
    double balance;

    double plus(double popolnenie) {
        balance += popolnenie;
        return balance;
    }
    void vivod() {
        System.out.println("№ " + id + " Имя: " + name +" Баланс карты= " +  balance);
    }

    double minus(double snyatie) {
        balance -= snyatie;
        return balance;
    }
}

    class BankAccountTest {
        public static void main(String[] args) {
            BankAccount MyAccount = new BankAccount();
            BankAccount YourAccount = new BankAccount();
            BankAccount HisAccount = new BankAccount();

            MyAccount.id = 1;
            MyAccount.name = "Zaur";
            MyAccount.balance = 120;
            System.out.println("баланс до изменения " + YourAccount.balance);
            MyAccount.plus(100);
            MyAccount.minus(0);
            MyAccount.vivod();

            YourAccount.id = 2;
            YourAccount.name = "David";
            YourAccount.balance = 5.75;
            System.out.println("баланс до изменения " + YourAccount.balance);
            YourAccount.plus(0);
            YourAccount.minus(4.25);
            YourAccount.vivod();

            HisAccount.id = 3;
            HisAccount.name = "Mike";
            HisAccount.balance = 13.75;
            System.out.println("баланс до изменения " + YourAccount.balance);
            HisAccount.plus(500);
            HisAccount.minus(0);
            HisAccount.vivod();

            System.out.println();


        }
    }
