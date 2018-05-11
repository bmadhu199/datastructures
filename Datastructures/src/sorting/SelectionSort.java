package sorting;

import java.util.Scanner;

public class SelectionSort {
  
  
  
  int[] selectionSorting(int[] arr,int length){
    
    for(int i =0;i<length-1;i++)
    {
      for(int j =i+1;j<length;j++)
      {
          
        if(arr[i] > arr[j])
        {
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i]= temp;
        }
        
      }
    }
    
    return arr;
  }
  

  
  public static void main(String args[]){
    
    
    Scanner scr = new Scanner(System.in);
    
    System.out.println("Please enter array lenght ");
    int length =  scr.nextInt();
    
    int[] arr = new int[length];
    
    System.out.println("Please enter set of number to sort...! ");
    
    for(int i = 0;i<length;i++)
    {
        arr[i] = scr.nextInt();
    }
    
    SelectionSort slsort = new SelectionSort();
    
    slsort.selectionSorting(arr, length);
    
    
    for(int i = 0;i<length;i++)
    {
      System.out.println(arr[i]);
    }
    
    
    
  }
  
}
