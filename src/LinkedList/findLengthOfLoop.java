class Node {
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}

public class findLengthOfLoop {
  public static void main(String[] args) {
    Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

      
}

public static int findLength(Node head)
{
    Node curr = head;
    int count =0;
    while(curr!=null)
    {
        curr = curr.next;
        count++;
    }

    return count;
  }

static int countNodesinLoop(Node head)
{
    //Add your code here.
    int count =0;
    Node start = detectCycle1(head);
    if(start == null){
        return 0;
    }else{
        Node curr = start;
        while(curr.next!=start)
        {
            curr = curr.next;
            count++;
        
        }
    }
    
    return count+1;

}

 public static Node detectCycle1(Node head)
{
   Node slow = head;
   Node fast = head;
   Node entry = head;

   if(head == null || head.next == null)
   {
      return null;
   }

   while(fast.next!=null && fast.next.next!=null)
   {
      slow = slow.next;
      fast = fast.next.next;

      if(slow == fast)
      {
          while(slow!=entry){
            slow = slow.next;
            entry = entry.next;
          }

          return entry;
      }
   }

   return null;
}

}
