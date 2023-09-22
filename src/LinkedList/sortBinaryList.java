public class Solution {
    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: empty list or single element list is already sorted
        }
        
        // Split the list into two halves
    Node prev = null, slow = head, fast = head;
    
    while (fast != null && fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    
    prev.next = null;
    
    // step 2. sort each half
    Node l1 = sortList(head);
    Node l2 = sortList(slow);
        
        // Merge the sorted halves
        return merge(l1, l2);
    }

        public Node findMiddle(Node head)
        {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node merge(Node left, Node right)
    {
        Node dummy = new Node(-1);
        Node current = dummy;

        while(left!=null && right!=null)
        {
            if(left.val < right.val)
            {
                current.next = left;
                left = left.next;
            }else{
                current.next = right;
                right = right.next;
            }

            current = current.next;
        }

        while(left!=null)
        {
            current.next = left;
            left = left.next;
            current = current.next;
        }

        while(right!=null)
        {
            current.next = right;
            right = right.next;
            current = current.next;
        }

        return dummy.next;
    }
}

