/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex20;

import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String amt = input.nextLine();
        double amount = Double.parseDouble(amt);
        System.out.print("What state do you live in? ");
        String state = input.nextLine();
        System.out.print("What county do you live in? ");
        String county = input.nextLine();

        if(state.equals("Wisconsin")){
            if(county.equals("Eau Claire")){
                double tax = amount*0.055;
                double total = amount+tax;
                System.out.print("The tax is $"+String.format("%.2f",tax)+".\nThe total is $"+String.format("%.2f",total)+".");
            }
            else if(county.equals("Dunn")){
                double tax = amount*0.054;
                double total = amount+tax;
                System.out.print("The tax is $"+String.format("%.2f",tax)+".\nThe total is $"+String.format("%.2f",total)+".");
            }
            else {
                double tax = amount*0.05;
                double total = amount+tax;
                System.out.print("The tax is $"+String.format("%.2f",tax)+".\nThe total is $"+String.format("%.2f",total)+".");
            }
        }
        else if(state.equals("Illinois")){
            double tax = amount*0.08;
            double total = amount+tax;
            System.out.print("The tax is $"+String.format("%.2f",tax)+".\nThe total is $"+String.format("%.2f",total)+".");
        }
        else {
            System.out.print("The total is $"+String.format("%.2f",amount)+".");
        }
    }
}
