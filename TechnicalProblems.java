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
public class TechnicalProblems {

    int sum;
    int[] finArray;
    int firstNum;
    int secondNum;

    Scanner input = new Scanner(System.in);

    int sizeOfArray = 0 ;
    int pairSum = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Problem1 use = new Problem1();
       //Problem 1 Solution
       use.arraySize();
       use.setArrayData();
       use.sumOfPair();
       use.findPairsOfArray();

       System.out.println("You are now entering solution 2!");

       Problem2 use2 = new Problem2();

       use2.makeArray();
       use2.sortArray();

       System.out.println("Problem THREE...THREe...THRee okay i'll stop now");

       Problem3 use3 = new Problem3();

       use3.setUpArray();
       // use3.removeDuplicate();
       use3.steveremoveDuplicate();

       Problem4 use4 = new Problem4();
       use4.func(1,2,12,19);

    }//End Main Technical Problems

}//End TechnaicalProblems
