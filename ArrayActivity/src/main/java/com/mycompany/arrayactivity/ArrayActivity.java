/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayactivity;

/**
 *
 * @author RC_Student_lab
 */
public class ArrayActivity {

    public static void main(String[] args) {
        //define arrays
        int[] numbers={200,350,700,400};
        
        String[] items={"Shirt","Pants","Sneakers","jacket"};
       
        //Calculate the sum of all price
        int sum = 0;
         double average=0;
         int maxPrice= numbers[3];
         int minPrice= numbers[0];
          for (int i=0;i < numbers.length;i++){
              sum = sum + numbers [i];
                average= average + numbers [0];
                if (minPrice >numbers [i]){
                    minPrice =numbers [i];
                 
                }else if(maxPrice < numbers [i]){
                    maxPrice = numbers [i];
                }
          }
        
        
            
           System.out.println("sum is"+sum);
        
        /*System.out.println("Totalprice:"+ sum);*/
        
        //Calculate the average price
       
      
       
        System.out.println("Average price:"+ average);
        
        //Find maximum and minimum Prices
        
        
        System.out.println("Maximum price:" + maxPrice);
           System.out.println("Minimum price:" + minPrice);
                
          //Get item   
                
        
        
        
       
                 
    }
}
