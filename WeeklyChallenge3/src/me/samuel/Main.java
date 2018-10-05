package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Prompt user for integer.
        Scanner input = new Scanner(System.in);

        //Set string response for later.
        String yesNo = "";

        //While counter>1, print all multiples of 5 and 7 in descending order, starting from value of startingNumber.
        do{

            //Capture input as variable startingNumber, and set integer value of counter relative to startingNumber.
            System.out.println("Enter any positive integer: ");
            int startingNumber = input.nextInt();
            int counter = startingNumber + 1;
            while (counter > 1){
                counter = counter - 1;
                if (counter % 5 == 0) {
                    System.out.println(counter);
                }
                else if (counter % 7 == 0) {
                    System.out.println(counter);
                }}

            //Prompt the user if want to enter the next number.
            Scanner response = new Scanner(System.in);
            System.out.println("\nWould you like to enter another number? (y/n) ");
            yesNo = response.nextLine();
            System.out.println("\n");

            //While response is y or yes, do the loop again.
        }while(yesNo.equalsIgnoreCase("y")||yesNo.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
    }
}