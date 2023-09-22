public class AddOnetoLinkedList {
  public static void main(String[] args) {
    
  }

  public static Node addOne(Node head) 
    { 
         head = reverse(head);
         boolean flag = true;
         Node curr = head;
         
         while(curr!=null && flag == true)
         {
             if(curr.next ==null && curr.data == 9)
             {
                 curr.data = 1;
                 Node temp = new Node(0);
                 temp.next = head;
                 head = temp;
                 curr = curr.next;
                 
             }else if(curr.next!=null && curr.data == 9)
             {
                 curr.data = 0;
                 curr = curr.next;
             }else{
                 curr.data = curr.data+1;
                 curr = curr.next;
                 flag = false;
             }
             
         }
         
         head = reverse(head);
         return head;
    }
    
    public static Node reverse(Node head)
    {
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
