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

public class indexOfLoopStartingPoint {
  public static void main(String[] args) {
    Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
  }

  //Naive solution
  public static Node detectCycle(Node head) {
       HashSet<Node> hs = new HashSet<>();
       Node curr = head;
       while(curr!=null)
       {
         if(!hs.contains(curr))
         {
          hs.add(curr);
         }else{
           return curr;
         } 

         curr = curr.next;
      }

      return null;

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
