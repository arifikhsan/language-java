package exercise;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        System.out.println("Mortgage Calculator");
        System.out.println("-------------------");

        System.out.print("Enter the loan amount: ");
        var loanAmount = new Scanner(System.in).nextInt();
        System.out.print("Enter the annual interest rate: ");
        var annualInterestRate = new Scanner(System.in).nextDouble();
        System.out.print("Enter the number of years: ");
        var numberOfYears = new Scanner(System.in).nextByte();

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        var monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;
        var numberOfPayments = numberOfYears * MONTHS_IN_YEAR;
        var mortgage = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfPayments)));
        var mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("The monthly payment is " + mortgageFormatted);
    }
}
