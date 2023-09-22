public class removeNodeFromMiddle {
  public static void main(String[] args) {
    
  }

  public Node deleteMiddle(Node head) {
    Node slow = head;
    Node fast = slow.next;

    if(head == null || head.next == null) return null;

    while(fast.next!=null && fast.next.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }

   slow.next = slow.next.next;

   return head;

   

}

}
