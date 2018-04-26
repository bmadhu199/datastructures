package dataStructures.com.practice;

import java.util.Arrays;

public class ContigiousNumbers {
  
  
  static boolean  isContigiousNumbers(int[] arr){
    
    Arrays.sort(arr);
    int temp =0;
    boolean status = false;
    
    for(int i =0; i<arr.length;i++)
    {
           if(i == 0){
            temp = arr[i];
            status = true;
           }else if(arr[i] == temp+1 && status == true )
           {
             temp = arr[i];
           }
           else{
             status = false;
              return status;
           }
           
           
    }
    
    return status;
  }

  public static void main(String[] args) {

    int[] arr =  {1,2,3,4,5};
    
    
    System.out.print(isContigiousNumbers(arr));
    
  }

}
