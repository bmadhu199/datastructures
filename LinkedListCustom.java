package dataStructures.com.LinkedList;

public class LinkedListCustom {
  
  
  Node head;

  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  
  
  void printList(LinkedListCustom.Node heads){
    Node node = head;
    while(node != null){
      
      System.out.println(node.data);
      node = node.next;
      
    }
    
  }
  
  
  int Listlength()
  {
    
    Node temp = head;
    int count =0;
     while(temp.next != null )
     {
       temp = temp.next;
       count++;
     }
    
     return count;
  }
  
  
  void addFront(LinkedListCustom.Node newNode) {

    newNode.next = head.next;
    head.next = newNode;
    System.out.println("Node inserted at FRONT");
}
  
  void addLast(LinkedListCustom.Node newNode){
      Node temp = head;
      
      
      
    while(temp.next != null){
       temp = temp.next;
    }
    
    temp.next = newNode;
    System.out.println("Node inserted at LAST");
    
  }
  
  
  void addAtPosition(int pos , Node newNode)
  {
    Node temp = head;
    int count= 0;
    
    while(count < pos)
    {
      temp = temp.next;
      count++;
    }
    
     System.out.println(count);
    newNode.next = temp.next;
    temp.next = newNode;
    System.out.println("Node inserted at POS"+pos);
    
  }
  
  
  void deleteAtFront(){
    
    Node temp = head;
    temp = head.next;
       
       head.next = temp.next;
       System.out.println("Deleted at Front");
  }
  
  
  void deleteAtEnd(){
    
    Node temp = head;
    Node prev = null;
    
    while(temp.next != null)
    {
      prev = temp;
      temp = temp.next;
    }
    
    prev.next = null;
    System.out.println("Deleted at End");
    
  }
  
  
  boolean deleteAtPos(int pos){
    
    int count =1;
    Node temp = head;
    Node prev = null;
    
    int len = Listlength();
      
    if(pos > len )
    {
        return false;
    }else if(pos==0){
      prev = head;
      head = head.next;
      prev = null;
    }else{
    
    while(count <= pos )
    {
       prev = temp;
       temp = temp.next;
       count++;
    }
    
    prev.next = temp.next;
    temp.next = null;
    
    
  }
    System.out.println("Deleted at pos :"+pos);
    return true;
  }
  
  
boolean deleteAtkey(int data){
    
    int count =0;
    Node temp = head;
    Node prev = null;
    
    
    while(temp.data != data )
    {
       prev = temp;
       temp = temp.next;
       count++;
    }
      if(temp.data == data)
      {
        prev.next = temp.next;
        temp.next = null;
      }
      else{
        
        return false;
      }
    
    
    
    System.out.println("Deleted  at key :"+data);
  return true;
    
  }


void reverseLinkedList()
{
  
    Node prev = null;
    Node current = head;
    Node temp = null;
    
      while(current.next != null)
      {
         temp =current.next;
         current.next = prev;
         prev = current;
         current = temp;
      }
      
      if(current.next==null)current.next = prev;
      
      head = temp;
      
      System.out.println("Linkedlist is reversed.....");

}


void deleteHead(){
  
   head = head.next; 
   
   System.out.println("deleted at head");
  
}

void addHead(Node node){
  
  Node temp = head;
  
  node.next = head.next;
  head.next = node;
  
  System.out.println("added at front");
    
  
}
  
  
  

  public static void main(String[] args) {

    LinkedListCustom create = new LinkedListCustom();
    
    create.head = new Node(0);

    Node first = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    
    
    create.head.next = first;
    first.next = second;
    second.next = third;
    
     create.printList(create.head);
     
     System.out.println("####################");
     
     Node oneT = new Node(1);
     
     create.addFront(oneT);
     create.printList(create.head);
     
     System.out.println("####################");
     Node threeT = new Node(4);
     create.addLast(threeT);
     create.printList(create.head);
     System.out.println("####################");
     
     Node five = new Node(5);
     create.addAtPosition(3, five);
     create.printList(create.head);
     System.out.println("####################");
     
     create.deleteAtFront();
     create.printList(create.head);
     System.out.println("####################");
     
     create.deleteAtEnd();
     create.printList(create.head);
     
     create.deleteAtPos(4);
     create.printList(create.head);
  
     create.deleteAtkey(5);
     create.printList(create.head);
     
    create.reverseLinkedList();
    create.printList(create.head);
    
    create.deleteHead();
    create.printList(create.head);
    
    
    Node ccc = new Node(111);
    create.addHead(ccc);
    create.printList(create.head);
  }

}
