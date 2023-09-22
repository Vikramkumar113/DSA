import java.util.HashSet;

class Node {
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}

public class ImportantdetectLoop {
  public static void main(String[] args) {
    Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
  }

  // Naive 
  public static boolean hasCycle(Node head)
  {
     Node curr = head;
     HashSet<Node> hs = new HashSet<>();
     while(curr!=null)
     {
         if(!hs.contains(curr))
         {
          hs.add(curr);
         }else{
           return true;
         } 

         curr = curr.next;
     }

     return false;
  }


  // efficient (MOST MOST MOST MOST MOST MOST important)
  public static boolean hasCycle1(Node head)
  {
    Node slow = head;
    Node fast = head;

    if(head == null || head.next == null)
    {
        return false;
    }

  while(fast.next!=null  && fast.next.next!=null)
    {

     slow = slow.next;
     fast = fast.next.next;

     if(fast == slow)
     {
        return true;
     }
    }

    return false;
  }
}
