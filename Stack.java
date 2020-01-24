package dataStructures.com.stack;

public class Stack {
    
     final int MAX = 1000; 
    int top =-1;
    int[]  arr = new int[MAX];
  
   // This function checks if stack is full
    boolean isFull(Stack stack)
    {
       if(stack.top < MAX ) return false;
       
      return true;
    }
    
    boolean isEmpty(Stack stack){
      
      if(stack.top < 0) return true;
      
      return false;
      
    }
    
    Stack push(Stack stack,int item)
    {
        if(isFull(stack)) return stack; 
        
       stack.arr[++top] = item;
       
       System.out.println("sucessfull pushed");
       return stack;
      
    }
    
    int pop(Stack stack){
      
      if(isEmpty(stack)) return 0;
      
       int x = arr[top--];
      
      System.out.println("sucessfull poped");
      return x;
      
    }
    
    
    void printStack(Stack stack){
      
      for(int i= 0 ; i<=stack.top ; i++)
      {
        System.out.println(stack.arr[i]);
      }
      
      System.out.println("End of Array");
      
    }
    
    
    

  public static void main(String[] args) {
    
    Stack stack = new Stack();
       stack.push(stack,10);
       stack.push(stack,20);
       stack.push(stack,30);
       stack.push(stack,40);
       stack.push(stack,50);
       
       stack.printStack(stack);
       
       stack.pop(stack);
       
       stack.printStack(stack);
       
       
       

  }

}
