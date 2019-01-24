/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technicalproblems;

import java.util.Scanner;

/**
 *
 * @author Jay's PC
 */
public class Problem2 {
    
    int[] secondArray;
   
    Scanner input = new Scanner(System.in);
    
    int size;
    
    int firstNum;
    int holdNum;
    
    public void makeArray() {
        
        System.out.println("How many indexes do you want your array to be?");
        
        size = input.nextInt();
        
        secondArray = new int[size];
        
        for(int i = 0; i < secondArray.length; i++) {
            
            System.out.println("Please enter an integer!");
            secondArray[i] = input.nextInt();
            
        }//End for i loop makeArray
        
        
        
    }//End makeArray
    
    
    public void sortArray() {
        
        for(int i = 0; i < secondArray.length; i++) {
            
            for(int j = 0; j < secondArray.length; j++) {
                
               if(secondArray[i] < secondArray[j]){
               
                   holdNum = secondArray[i];
                   secondArray[i] = secondArray[j];
                   secondArray[j] = holdNum;
                   
               }//End if
                
            }//End for loop j sortArray
            
        }//End for loop i sortArray
        
        System.out.println("New Sorted Array!");
        
        for(int k = 0; k < secondArray.length; k++) {
            
            System.out.print(secondArray[k]+ " ");
            
        }//End for k print
        
    }
    
    
}//End problem2 class
