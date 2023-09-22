class Node {
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}



public class middleOfLinkedList {
  public static void main(String[] args) {
    Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
      //  head.next.next.next.next.next = new Node(40);
      middleNode(head);
  }

  public static Node middleNode(Node head) {
    int length = findLength(head);
    int middle = length/2;

    Node current = head;
    for(int i=0; i< middle; i++)
    {
        current = current.next;
    }

    return current;

}


public static int findLength(Node head)
{
    int count = 0;
    while(head!=null){
        head = head.next;
        count++;
    }

    return count;
}
}
