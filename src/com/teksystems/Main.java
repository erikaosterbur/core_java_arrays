package com.teksystems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        problemOne();
//        problemTwo();
//        problemThree();
//        problemFour();
//        problemFive();
//        problemSix();
        problemSeven();
        problemEight();
        problemNine();
        problemTen();
    }

    public static void problemOne () {
        /*Write a program that creates an array of integers with a length of 3.
        Assign the values 1, 2, and 3 to the indexes. Print out each array element.*/

        //declare array
        Integer[] arr = new Integer[3];

        //assign values to array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        //print out array
        System.out.println(Arrays.toString(arr));
    }

    public static void problemTwo () {
        /*Write a program that returns the middle element in an array.
        Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7 */

        //declare array
        Integer[] arr = new Integer[5];

        //assign values to array
        arr[0] = 13;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 68;
        arr[4] = 2;

        //find middle index value
        int mid = arr.length / 2;

        //print middle value
        System.out.println(arr[mid]);

    }

    public static void problemThree () {
        /*Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”.
        Print out the array length.
        Make a copy using the clone( ) method.
        Use the Arrays.toString( ) method on the new array to verify that the original array was copied. */

        //declare array and assign values
        String[] arr = {"red", "green", "blue", "yellow"};

        //print out array length
        System.out.println(arr.length);

        //make a copy
        String[] arrTwo = arr.clone();

        //print new array
        System.out.println(Arrays.toString(arrTwo));
    }

    public static void problemFour () {
        /*Write a program that creates an integer array with 5 elements (i.e., numbers).
        The numbers can be any integers.
        Print out the value at the first index and the last index using length - 1 as the index.
        Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).
        Notice the type of exception which is produced.
        Now try to assign a value to the array index 5.
        You should get the same type of exception.*/

        //declare array
        Integer[] arr = {6, 20, 9, 11, 14};

        //print value at first index and last index
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

        //print value at index = length
        System.out.println(arr[arr.length]);
        //gives error: Array index is out of bounds

        //assign value to array at index 5
        arr[5] = 44;
        System.out.println(arr[5]);
        //gives error: arr[5] is out of bounds

    }

    public static void problemFive () {
        /*Write a program where you create an integer array with a length of 5.
        Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.*/

        //declare array
        Integer[] arr = new Integer[5];

        //loop through array and assign values
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        //print out array
        System.out.println(Arrays.toString(arr));

    }

    public static void problemSix () {
        /*Write a program where you create an integer array of 5 numbers.
        Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.*/

        //declare array
        Integer[] arr = new Integer[5];

        //loop through array and assign values
        for(int i = 0; i < arr.length; i++){
            arr[i] = i * 2;
        }

        //print out array
        System.out.println(Arrays.toString(arr));
    }

    public static void problemSeven () {
        /*Write a program where you create an array of 5 elements.
        Loop through the array and print the value of each element, except for the middle (index 2) element.*/

        //declare array
        Integer[] arr = {10, 20, 30, 40, 50};

        //loop through array and print each element except for middle element
        for(int i = 0; i < arr.length; i++) {
            if (i !=  arr.length/2){
                System.out.println(arr[i]);
            }
        }
    }

    public static void problemEight () {
        /*Write a program that creates a String array of 5 elements and
        swaps the first element with the middle element without creating a new array.*/
    }

    public static void problemNine () {
        /*Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
        Print the array in ascending order, print the smallest and the largest element of the array.
        The output will look like the following:
            Array in ascending order: 0, 1, 2, 4, 9, 13
            The smallest number is 0
            The biggest number is 13*/
    }

    public static void problemTen () {
        /*Create an array that includes an integer, 3 strings, and 1 double. Print the array.*/
    }


}
