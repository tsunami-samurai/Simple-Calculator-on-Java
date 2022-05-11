package com.company;

public class SecondTierBank {
    private static double FIXEDBANKREWARD = 1.02;
    private Calculator calculator;

    SecondTierBank(){
        calculator = new Calculator();
    }

    public double calculateDeposit(double amount, int months, String client){
        return calculator.depositReward(amount, months, client) * FIXEDBANKREWARD;
    }
}
