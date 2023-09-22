public class removeNthNodeFromEnd {
  public static void main(String[] args) {
    Node head = new Node(1);
  head.next = new Node(2);
  head.next.next = new Node(3);
  head.next.next.next = new Node(4);
  head.next.next.next.next = new Node(5);
  }

  public Node removeNthFromEnd(Node head, int n) {
    if(head == null || head.next == null){
            return null;
    }

    Node curr = head;
    int index = findLength(head)-n;

    if(findLength(head) == n){
        return head.next;
    }

        int count =1;
        while(count!=index && curr!=null)
        {
            curr = curr.next;
            count++;
        }

        curr.next = curr.next.next;

        return head;        

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
