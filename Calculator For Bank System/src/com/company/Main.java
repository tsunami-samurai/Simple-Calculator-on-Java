package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bank = in.nextLine();
        double amount;
        int month;
        String client;
        switch (bank){
            case "National Bank":
                NationalBank nb = new NationalBank();
                System.out.println("Enter individual or legalEntity, amount, num of month");
                client = in.nextLine();
                amount = in.nextDouble();
                month = in.nextInt();

                System.out.println(nb.calculateDeposit(amount,month,client));
                break;

            case "Second Tier Bank":
                SecondTierBank sb = new SecondTierBank();
                System.out.println("Enter individual or legalEntity, amount, num of month");
                client = in.nextLine();
                amount = in.nextDouble();
                month = in.nextInt();

                System.out.println(sb.calculateDeposit(amount,month,client));
                break;

            default:
                System.out.println("Something wrong");

        }
    }
}