package com.geek182.javaexercises.udemy.challenges.array;
/*
Reverse an array order
 */
public class ReverseArrayChallenge {
    private static void reverse(int[] array){
/*
   take the first position and switch with the last one
   but stop on the half since the first two positions were switched already.
*/
        int count = array.length-1;
        int half = array.length /2;
        for(int i=0; i<half; i++){
            int tempSwitchA = array[i];
            int tempSwitchB = array[count];
            array[i] = tempSwitchB;
            array[count] = tempSwitchA;
            count--;

            }
        }

    /*
    Below is the instructor version
     */

    private static void reverseInstructorVersion(int[] array){
        int maxIndex = array.length -1;
        int halfLength = array.length /2;
        for(int i =0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex -1];
            array[maxIndex - 1] = temp;
        }
    }

    public static void main(String[] args){
        int[] myarray = {100,200,300,400,500};
        for (int i : myarray) {
            System.out.println("Before reversing the value is " + i + "\r");
        }
        System.out.println("######");
        reverse(myarray);
        for (int i : myarray) {
            System.out.println("After reversing the value is " + i + "\r");
        }

    }
}
