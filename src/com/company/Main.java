package com.company;

public class Main {
    public static void main(String[] args) {
        DirectReductionLoan d = new DirectReductionLoan(15000, .09, 60);
        TablePrinter t = new TablePrinter(d);
        System.out.println(t.printTable(9));
    }
}
