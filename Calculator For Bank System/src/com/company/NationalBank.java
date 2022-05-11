package com.company;

public class NationalBank {
    private static double FIXEDBANKREWARD = 1.01;
    private Calculator calculator;

    NationalBank(){
        calculator = new Calculator();
    }

    public double calculateDeposit(double amount, int months, String client){
        return calculator.depositReward(amount, months, client) * FIXEDBANKREWARD;
    }
}
