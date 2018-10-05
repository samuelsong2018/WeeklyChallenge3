package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any positive integer: ");
        int startingNumber = input.nextInt();
        int counter = startingNumber+1;
        while(counter>1){
            counter = counter-1;
            if(counter%35==0){
                System.out.println("CopyCat");
            }
            else if (counter%5==0){
                System.out.println("Copy");
            }
            else if (counter%7==0){
                System.out.println("Cat");
            }
            else{
                System.out.println(counter);
            }
        }
    }
}
