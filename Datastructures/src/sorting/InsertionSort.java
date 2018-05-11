package sorting;

import java.util.Scanner;

public class InsertionSort {
  
  
  
  int[] InsertionSorting(int[] arr,int length){
    
    
    for(int i = 1;i<length;i++)
    {
       int key = arr[i];
       
       int j = i-1;
       
       while(j>=0 && key < arr[j])
       {
          arr[j+1] = arr[j];
         
          j = j-1;
       }
       
       arr[j+1] =key;
    }
    
    
   return arr; 
    
  }

  public static void main(String[] args) {

Scanner scr = new Scanner(System.in);
    
    System.out.println("Please enter array lenght ");
    int length =  scr.nextInt();
    
    int[] arr = new int[length];
    
    System.out.println("Please enter set of number to sort...! ");
    
    for(int i = 0;i<length;i++)
    {
        arr[i] = scr.nextInt();
    }
    
    
    InsertionSort inrSort = new InsertionSort();
    
    inrSort.InsertionSorting(arr, length);
    
    for(int i =0 ;i<length ;i++)
    {
      System.out.println(arr[i]);
    }
    
  }

}
