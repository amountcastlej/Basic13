import java.util.Arrays;
import java.util.ArrayList;

public class BasicThirteen {
    public static void main(String[] args){
        // System.out.println("Hello basic 13");

        // Primitive Arrays
        // int[] x = new int[7]; // declaring a new array of 7 ints
        // x[0] = 4;
        // x[1] = 6;
        // x[2] = 8;

        // int[] x = {4,6,8,9,6,3,2};
        // System.out.println(Arrays.toString(x)); 
                           // Prints out an array

        // x[0] = 7;

        // arraylist arrays

        // ArrayList<Integer> listOne = new ArrayList<Integer>(Arrays.asList(23,5,16));
        // asList puts the numbers inside parenthesis in the beginning of the list

        // listOne.add(5);
        // listOne.add(15);
        // listOne.add(51);
        // listOne.add(50);
        // listOne.add(12);

        // System.out.println(listOne);
        // END OF ARRAY CODE

        // BASIC 13 Code

        // printNumbers();
        // evenNums();
        // System.out.println(factorial(50));

        // create an int[] array
        int[] arr1 = {4,6,7,12,-3};
        // iterateArr(arr1);

        // findMin(arr1);

        System.out.println(getEvens(10));
        getEvens(15);
    }    

    // Print 1 - 23
    public static void printNumbers(){
        
        for(int i = 1; i<24; i++){
            System.out.println(i);
        }
    }

    // Print even numbers between 1 - 50

    public static void evenNums(){
        for(int i = 2; i <=50; i+=2){
            System.out.println(i);
        }
    }

    // factorial of 255 AKA Product of all nums to some number input; adding all the values together
    public static int factorial(int num){
        int total = 1;
        for (int i = 1; i<=num; i++){
            // System.out.println(i);
            total *= i;
        }
        return total;
    }

    // Iterate through a GIVEN array
    public static void iterateArr(int[] inputArr){

        // one way for doing for loop - this gives u access to the index numbers 
        // if we want to modify the array while looping
        // for(int i = 0; i< inputArr.length; i++){
            // System.out.println(i);
            // System.out.println(inputArr[i]);
            // inputArr[i] = 5; // You can modify index array values
        // }
        // System.out.println(Arrays.toString(inputArr));

        // Enhanced for loop - useful if i only want to see the values without modifying it
        // benefit is its less typing

        for(int value: inputArr){
            System.out.println(value);
        }
        // System.out.println(Arrays.toString(inputArr));
    }

    // find min
    public static void findMin(int[] inputArr){
        // set my min to be the first value in the array
        int minVal = inputArr[0];
        for(int value: inputArr){
            if(value < minVal){
                minVal= value;
            }
        }
        System.out.println(minVal);
    }

    // Array with Even Numbers. Write a method that creates and returns an array 'y' that contains all the even numbers between 1 to some given number. 
    // When the method is done, 'y' should be an array containing the even numbers up to the given input

    public static ArrayList<Integer> getEvens(int someNum){
        // create an array to put values into
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i =2; i<=someNum; i+=2){
            result.add(i);
        }
        // System.out.println(result);
        return result;
    }


}
