import java.util.Stack;


class Node {
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}

public class palindromeOrNot {
  public static void main(String[] args) {
    Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        
  }


  // Naive approach
   public boolean isPalindrome(Node head) {
        Stack<Node> st = new Stack<Node>();
        Node curr = head;

        while(curr!=null)
        {
            st.push(curr);
            curr = curr.next;
        }

        curr = head;
        while(curr!=null){
            Node top = st.pop();
            if(curr.data!=top.data)
            {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }

    //Efficient approach
}
