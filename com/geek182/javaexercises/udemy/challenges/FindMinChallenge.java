package com.geek182.javaexercises.udemy.challenges;

import java.util.Scanner;
/*
Find the minimal value inside the array
 */

public class FindMinChallenge {
    private static Scanner scanner = new Scanner(System.in);
    static int[] readIntegers(int count) {
        System.out.println("Please provide your input \r");
        int[] inputArray = new int[count];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return inputArray;

    }
    static void showMin(int array){
            System.out.println("Min value is " + array);
        }

        static int findMin(int[] array){
            int [] minArray = new int[array.length];
            boolean check = true;
            for(int i=0; i<minArray.length; i++){
                minArray[i] = array[i];
            }
            while (check) {
                check = false;
            for(int i=0; i < array.length-1; i++){
                int tempSwitch;
                int tempSwitch1;
                if(minArray[i] < minArray[i+1]){
                    tempSwitch = minArray[i+1];
                    tempSwitch1 = minArray[i];
                    minArray[i] = tempSwitch;
                    minArray[i+1] = tempSwitch1;
                    check = true;
                }
            }
        }
            return minArray[minArray.length-1]; // return the last position after array was sorted
    }

    public static void main(String[] args){
        System.out.println("Size of the array:");
        int arraySize = scanner.nextInt();
        scanner.nextLine();
       showMin(findMin(readIntegers(arraySize)));


    }
}
