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
public class Problem3 {
    int thirdSize;
    
    Scanner input = new Scanner(System.in);
    
    int[] thirdArray;
    int[] noDupesArray;
    
    int count = 0;
    public void setUpArray() {
        
        System.out.println("How many indexes do you want your array to be?");
        thirdSize = input.nextInt();
        
        thirdArray = new int[thirdSize];
        
        for(int i = 0; i < thirdArray.length; i++) {
            
            System.out.println("Enter a integer");
            thirdArray[i] = input.nextInt();
            
        }//End for i loop
    
    }//End setUpArray method
    
    public void removeDuplicate() {
     
        for(int i = 0; i < thirdArray.length; i++) {
            
            for(int j = i+1; j < thirdArray.length; j++) {
                
             if(thirdArray[i] == Math.abs(thirdArray[j])){
                 
                thirdArray[j] = (thirdArray[j]*-1);
                count++;
                
               }//End if
                
             }//End if j loop  
            
        }//End for i loop
        
        System.out.println();
        
        noDupesArray = new int[thirdArray.length - count];
        count = 0;
        
        for(int i = 0; i < thirdArray.length; i++) {
            
            for(int j = i+1; j < thirdArray.length; j++) {
                
             if(thirdArray[i] != Math.abs(thirdArray[j]) && count < noDupesArray.length && (thirdArray[i] >= 0)){
                 
                noDupesArray[count] = thirdArray[i];
                count++;
                break;
                
               }//End if
                
             }//End if j loop  
            
        }//End for i loop
        
        System.out.println();
        
        for(int k = 0; k < noDupesArray.length; k++) {
            
          System.out.print(noDupesArray[k]+" ");
            
        }
        
    }//End removeDuplicate
    
}//End Problem 3
