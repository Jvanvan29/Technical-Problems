/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package technicalproblems;
import java.util.Scanner;

/**
 *
 * @author Jay's PC
 */
public class Problem1 {

    int sum;
    int[] finArray;
    int firstNum;
    int secondNum;

    Scanner input = new Scanner(System.in);

    int sizeOfArray = 0 ;
    int pairSum = 0;

    public void arraySize() {

           System.out.println("What size array would you like?");
           sizeOfArray = input.nextInt();

           int[] arr = new int[sizeOfArray];
           finArray = arr;

    }//End makeArray method

    public void setArrayData() {

           for(int i = 0; i < finArray.length; i++ ) {

               System.out.println("Please enter a integer for this array?");
               finArray[i] = input.nextInt();

           }//End for loop for putting data into array

    }

    public void sumOfPair() {
        System.out.println("What sum would you like the pairs to add up too?");
        pairSum = input.nextInt();
        sum = pairSum;

    }//End sumOfPair method

    public void findPairsOfArray() {

        for(int i = 0; i < finArray.length; i++) { //n

            firstNum = finArray[i];

            for(int j = i+1; j < finArray.length; j++) { //n

                if(finArray[i] + finArray[j] == sum) //??
                {
                    secondNum = finArray[j];
                    System.out.println(firstNum + " + " + secondNum +" = "+ sum );

                }//End if statement

            }//End trying to find matching sum

        }//End finArray length loop

    }//End findPairsOfArray

}
