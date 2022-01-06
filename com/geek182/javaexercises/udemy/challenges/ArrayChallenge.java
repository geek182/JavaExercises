package com.geek182.javaexercises.udemy.challenges;

/*
Create a program using arrays that sort a list of integers in descending order.
if you have an array 106, 80, 101, 12, 1, 0 it should returns
0, 1, 12, 80, 101, 106
*/

import java.util.Scanner;

public class ArrayChallenge{
   public static Scanner scanner1 = new Scanner(System.in);

    public ArrayChallenge(int size){

        this.PrintSortedArray(this.GetInput(size));

    }
    public int[] SortArrayDesc(int[] array){
        int[] SortedArray = array;
        int positionCount = 1;
    /*
        while - check if positionCount is lower than array length and if so keep sweeping the array.
    */
        while (positionCount <= array.length){
            for(int i = 0; i < array.length; i++){
                if (i+1 == array.length){ // final position
                    // once reach the final position increase count value by one.
                    if (array[i-1] < array[i]){ // if the current value is lower than the previous, replace the position between them.
                        int tempSwitch = array[i];
                        SortedArray[i] = array[i-1];
                        array[i+1] = tempSwitch;
                    }
                    else {
                        SortedArray[i] = array[i];
                    }
                    positionCount++; // once reach the final position increase count value by one.
                }
                else{ // not the final position
                    if (array[i] < array[i+1]){  // if the current value is lower than the next, replace the position between them.
                        int tempSwitch = array[i];
                        SortedArray[i] = array[i+1];
                        array[i+1] = tempSwitch;
                    }
                    else {
                        SortedArray[i] = array[i];
                    }
                }
            }
        }
        return SortedArray;
    }
    public void PrintSortedArray(int[] array){
        int[] result = this.SortArrayDesc(array); //Calls Method SortArray()
        for (int i = 0; i < result.length; i++) {
            System.out.println("values " + result[i]);

        }
        System.out.println("##########");
    }

    public int[] GetInput(int size){
        int[] numbers = new int[size];
        System.out.println("Please type " + size + " numbers");
        for(int i=0; i<numbers.length; i++){
            numbers[i] = scanner1.nextInt();
        }
        return numbers;

    }
    public static void main(String[] args){
       /* if entered 1,2,3,4,5
          should print 5,4,3,2,1
        */
        ArrayChallenge myarray = new ArrayChallenge(5);
    }
}
