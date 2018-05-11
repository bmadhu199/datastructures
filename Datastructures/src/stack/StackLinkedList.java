package stack;

public class StackLinkedList {

  Node head;
  Node top = null;

  static class Node {

    int data;
    Node next;

    public Node(int data) {

      this.data = data;
      this.next = null;
    }

  }

  void stacktraversel() {

    Node temp = head;

    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }

  }

  void printList(StackLinkedList.Node head) {
    Node node = head;
    while (node != null) {
      System.out.println(node.data);
      node = node.next;
    }

  }

  void push(Node node) {

    if (head.next == null) {
      head.next = node;
      top = head.next;
      return;
    }

    Node temp = head;
    node.next = head.next;
    head.next = node.next;
    top = head.next;

  }

  int pop(Node node) {

    if (head.next == null) {
      System.out.println("stack is empty");
      return 0;
    }

    Node temp = head;
    head = head.next;
    top = head.next;
    return temp.next.data;
  }

  int topEle() {
    return top.data;
  }

  public static void main(String[] args) {

    StackLinkedList sll = new StackLinkedList();

    sll.head = new Node(0);
    Node first = new Node(11);

    Node sec = new Node(22);
    Node tir = new Node(44);
    Node four = new Node(55);

    sll.push(first);
    sll.push(sec);
    sll.push(tir);
    sll.push(four);

    System.out.println(sll.pop(sll.head));

    System.out.println("top ele is....." + sll.topEle());
    sll.printList(sll.head);
    
  }

}
