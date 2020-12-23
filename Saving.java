import java.util.*;

class SavingsAccount {
    static int annualInterestRate;
    private double savingsBalance;

    SavingsAccount(int savings) {
        savingsBalance = savings;
    }

    double calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance += monthlyInterest;
        return savingsBalance;
    }

    static void modifyInterestRate(int n) {
        annualInterestRate = n;
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(4);
        System.out.println("Saver 1:\nBalance"+saver1.calculateMonthlyInterest());
        System.out.println("Saver 2:\nBalance"+saver2.calculateMonthlyInterest());
        System.out.println("Rate=5%");
        SavingsAccount.modifyInterestRate(5);
        System.out.println("Saver 1:\nBalance"+saver1.calculateMonthlyInterest());
        System.out.println("Saver 2:\nBalance"+saver2.calculateMonthlyInterest());

    }
}
