package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */

public class Solution26 {
    /*
    Create a program that:
    helps determine how many months it will take to pay off a credit card balance.
    The program should ask the user to enter the balance of a credit card.
    Return the number of months needed.

    formula:
    n = -(1/30) * log(1 + b/p * (1-(1 +i)^30)) /log(1 + i);

    n = number of months
    i = daily rate (APR/365)
    b = balance
    p = monthly payment
     */
    class PaymentCalculator{
       public static void main(String[] args){
           calculateMonthsUntilPaidOff();
        }
        public static void calculateMonthsUntilPaidOff(){
           /*
           This will contain the calculations
           taking APR and turning it into i
           then creating the output n with the above formula
           'above' relative to the code, you know, its commented somewhere give me a break
           just out here trying to calculate paying off credit cards.
           */
       }
    }
}
