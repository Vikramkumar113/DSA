import java.util.HashSet;

public class intersectionPoint {
  public static void main(String[] args) {
    
  }

  // Naive approach tc = 0(m+n) sc= 0(N)
  public Node getIntersectionNode(Node headA, Node headB) {
    HashSet<Node> hs = new HashSet<Node>();

    Node curr = headA;

    while(curr!=null)
    {
        if(!hs.contains(curr)){
            hs.add(curr);
        }

        curr = curr.next;
    }

    Node curr1 = headB;
    while(curr1!=null)
    {
        if(!hs.contains(curr1))
        {
            hs.add(curr1);
        }else{
            return curr1;
        }

        curr1= curr1.next;
    }

    return null;

}

//Optimized tc=(m+n) sc = 0(1)
public Node getIntersectionNode1(Node headA, Node headB) {
  int l1 = findLength(headA);
  int l2 = findLength(headB);
  int count =0;

  Node curr1 = headA;
  Node curr2 = headB;

  if(l1 <= l2)
  {
      int move = l2-l1;
      while(count!=move)
      {
          curr2=curr2.next;
          count++;
      }


  }else{
      int move = l1-l2;
      while(count!=move)
      {
          curr1= curr1.next;
          count++;
      }
  }


      while(curr1!=null && curr2!=null)
      {
      if(curr1 == curr2)
      {
          return curr1;
      }

      curr1 = curr1.next;
      curr2 = curr2.next;
   
  }

  

  return null;


  

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

}
