class Node {
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}




public class reverseLinkedList {
 public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        reverseLinkedList(head);
        printLinkedList(head);

  }

  public static void printLinkedList(Node head){
    while(head!=null)
    {
       System.out.println(head.data);
       head = head.next;
    }
}

  public static Node reverseLinkedList(Node head) {
      Node curr = head;
      Node prev = null;

      while(curr!=null)
      {
          Node temp = curr.next;
          curr.next = prev;
          prev = curr;
          curr = temp;
      }

      return prev;
  }
 }
