package sorting;

import java.util.Scanner;

public class BubbleSort {
  
  int[] bubbleSorting(int[] arr, int length){
    
    
    for(int i = 0; i<length;i++)
    {
      for(int j =0 ; j< length-i-1;j++)
      {
        
        if(arr[j] > arr[j+1])
        {
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
        }
        
        
      }
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
    
    BubbleSort bubSort = new BubbleSort();
    
    bubSort.bubbleSorting(arr, length);
    
    for(int i = 0;i<length;i++)
    {
      System.out.println(arr[i]);
    }
    
    
  }

}
