package com.company;


public class DirectReductionLoan {
    private final double INITIAL_BALANCE;
    private final double INTEREST_RATE;
    private final int N_MAX;
    private final double MONTHLY_PAYMENT;

    public DirectReductionLoan(double initialBalance, double interestRate, int nMax) {
        INITIAL_BALANCE = initialBalance;
        INTEREST_RATE = interestRate;
        N_MAX = nMax;
        MONTHLY_PAYMENT = (initialBalance * interestRate * Math.pow(1 + interestRate, nMax)) / (Math.pow(1 + interestRate, nMax) - 1);
    }

    public double getInitalBalance() {
        return INITIAL_BALANCE;
    }

    public double getInterestRate() {
        return INTEREST_RATE;
    }

    public double getNMax() {
        return N_MAX;
    }

    public double getMontlyPayment() {
        return MONTHLY_PAYMENT;
    }

    public double interestCalc(int n) {
        return balanceCalc(n) * INTEREST_RATE;
    }

    public double loanReductionCalc(int n) {
        return MONTHLY_PAYMENT - interestCalc(n);
    }

    public double balanceCalc(int n) {
        if (n == 0) {
            return INITIAL_BALANCE;
        }
        return 1.01 * balanceCalc(n - 1) - MONTHLY_PAYMENT;
    }
}
