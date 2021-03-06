package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution35 {
    /*
Write a program that
prompts user for input:
if input is "" blank, break loop, run rng to determine winner
if user input is "name" continue loop.
 */
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        winner();
    }
    static void winner() {

        ArrayList<String> name = new ArrayList<>();
        Random rand = new Random();

        while (true) {
            System.out.print("Enter a name: ");
            name.add(in.next());
            if (name.equals("")) {
                int randomize = rand.nextInt(name.size() - 1);
                System.out.print("The winner is... " + randomize);
                break;
            }
        }
    }

}
