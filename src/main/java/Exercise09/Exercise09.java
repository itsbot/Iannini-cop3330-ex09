/*
 *  UCF COP3330 Fall 2021 Exercise 9 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise09;
import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        System.out.println("Enter the width");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();

        System.out.println("Enter the length");
        Scanner sc1 = new Scanner(System.in);
        int length = sc1.nextInt();

        int sqftPerGal = 350;
        int sqfeet = length*width;
        int gal = (int) Math.ceil((double)sqfeet/sqftPerGal);

        System.out.println("You will need to purchase "+gal+" gallons of paint to cover "+sqfeet+" square feet.");
    }
}
