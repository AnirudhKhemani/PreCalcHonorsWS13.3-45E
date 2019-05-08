package com.company;

public class TablePrinter {
    DirectReductionLoan d;

    public TablePrinter(DirectReductionLoan d) {
        this.d = d;
    }

    public String abbreviator(double n) {
        n = Math.round(n * 100);
        n = n / 100;
        String result = "" + n;
        if (result.length() > 8) {
            result = result.substring(0, 8);
        } else if (result.length() < 8) {
            int numSpaces = 8 - result.length();
            for (int i = 0; i < numSpaces; i++) {
                result += " ";
            }
        }
        return result;
    }

    public String printTable(int n) {
        String result =  "";
        result += "N        A        I        R        \n";
        for (int i = 0; i <= n; i++) {
            result += (abbreviator(i) + " " + abbreviator(d.balanceCalc(i)) + " " + abbreviator(d.interestCalc(i)) + " "
                    + abbreviator(d.loanReductionCalc(i)) + "\n");
        }
        return result;
    }
}
