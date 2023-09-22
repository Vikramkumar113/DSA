import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class Node{
  int data;
  Node left;
  Node right;

  public Node(int key)
  {
     data = key;
  }
}


public class preorder {
  public static void main(String[] args) {
    Node root=new Node(10);
    root.left=new Node(20);
    root.right=new Node(30);
    root.left.left=new Node(40);
    root.left.right=new Node(50);
    root.right.left=new Node(60);
    root.right.right=new Node(70);

    preOrderTraversal(root);
  }

  public static void preOrderTraversal(Node root)
  {
     if(root == null) return;
     Stack<Node> st = new Stack<Node>();
    st.push(root);
      while(!st.isEmpty())
      {
        Node curr = st.pop();
        System.out.println(curr.data+"");
        if(curr.right!=null) st.push(curr.right);
        if(curr.left!=null) st.push(curr.left);
      }
    }
}
