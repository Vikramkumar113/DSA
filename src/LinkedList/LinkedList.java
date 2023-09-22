class Node {
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(40);

       // printLinkedList(head);
       deleteLast(head);
       
    }

    public static void printLinkedList(Node head){
          while(head!=null)
          {
             System.out.println(head.data);
             head = head.next;
          }
    }

    public static void deleteLast( Node head)
    {
        Node current = head;
        while(current.next.next!=null)
        {
            current = current.next;
          
        }
        current.next = null;

        printLinkedList(head);
        


    }
  }
