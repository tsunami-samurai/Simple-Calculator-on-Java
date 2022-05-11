package com.company;

public class Calculator {
    private static double RATEFORLEGALENTITIES = 0.08;
    private static double RATEFORINDIVIDUALS = 0.1;
    public double depositReward(double amount, int months, String client){
        if(client.equals("individual")){
            return amount + amount * RATEFORINDIVIDUALS * months / 12.0;
        }
        else if (client.equals("legalEntity")){
            return amount + amount * RATEFORLEGALENTITIES * months / 12.0;
        }
        else{
            System.out.println("error!");
            return 0;
        }
    }
}
