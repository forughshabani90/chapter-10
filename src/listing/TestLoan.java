package listing;

import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter annual interest rate, for example, 8.25:");
        double annualInterestRate = input.nextDouble();
        int numberOfYears = input.nextInt();
        double loanAmount = input.nextDouble();
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n" +
                loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());

    }
}

