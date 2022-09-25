package com.geek182.javaexercises.udemy.challenges.UserInput;

import java.util.Scanner;
/*
 Receive a fix number of inputs(10) and sum the total mount;
*/

public class ReadingUserInputChallenge {
    public static int SumInputValues() {
        Scanner scanner = new Scanner(System.in);
        int[] InputPosition = new int[3];
        int TotalAmount = 0;
        for (int i = 0; i <= InputPosition.length - 1; i++) {
            System.out.println("Enter number # " + (i + 1));
            boolean IsValid = scanner.hasNextInt();
            if (IsValid){
            InputPosition[i] = scanner.nextInt();
            TotalAmount += InputPosition[i];
             }
            else{
                System.out.println("Invalid number. Please try it again.");
                i--; // if the input is invalid return to origin number
                scanner.nextLine();
            }
        }
       // scanner.close();
        return TotalAmount;
    }
/* Instructor version */
public static void SumInputValuesInstructorVersion(){
    Scanner scanner = new Scanner(System.in);
    int counter = 0;
    int sum = 0;
    while(true){
        int order = counter + 1;
        System.out.println("Enter number #" + order + ":");
        boolean isAnInt = scanner.hasNextInt();

        if (isAnInt){
            int number = scanner.nextInt();
            counter++;
            sum += number;
            if (counter == 10){
                break;
            }
        }
        else {
            System.out.println("Invalid number");
        }
        scanner.nextLine(); //handle end of the line (enter key)
    }
    System.out.println("sum = " + sum);
    scanner.close();
        }

    public static void main(String[] args){
        /* My answer :) */
       System.out.println("Total Amount: " + ReadingUserInputChallenge.SumInputValues());

       /* Instructor version */
 //       ReadingUserInputChallenge.SumInputValuesInstructorVersion();
    }
}

