class Node {
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}

public class ImportantoddEvenLinkedList {
  public static void main(String[] args) {
  Node head = new Node(1);
  head.next = new Node(2);
  head.next.next = new Node(3);
  head.next.next.next = new Node(4);
  head.next.next.next.next = new Node(5);
  oddEvenList(head);
  printLinkedList(head);
  }

  public static void printLinkedList(Node head){
    while(head!=null)
    {
       System.out.println(head.data);
       head = head.next;
    }
}

// efficient (MOST MOST MOST MOST MOST MOST Important)
  public static Node oddEvenList(Node head) {
       

    if(head == null || head.next == null || head.next.next == null)
    {
         return head;
    } 
    
    Node oddHead = head;
    Node evenHead = head.next;
    Node odd = oddHead;
    Node even = evenHead;

    while (even != null && even.next != null) {
    odd.next = even.next;
    odd = odd.next;
    even.next = odd.next;
    even = even.next;
    }

    odd.next = evenHead;

    return oddHead;
}
}
