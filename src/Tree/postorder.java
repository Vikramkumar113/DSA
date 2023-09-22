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

public class postorder {
  public static void main(String[] args) {
      Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
    	root.right.right=new Node(70);

      postorderTraversal(root);
  }


  public static void postorderTraversal(Node root)
  {
      Stack<Node> st1 = new Stack<Node>();
      Stack<Node> st2 = new Stack<Node>();
      if(root == null) return;
      st1.push(root);

      while(!st1.isEmpty())
      {
         Node curr = st1.pop();
         st2.push(curr);
         if(curr.left!=null) st1.push(curr.left);
         if(curr.right!=null) st1.push(curr.right);
      }

      while(!st2.isEmpty())
      {
        Node curr = st2.pop();
        System.out.println(curr.data+" ");

      }


  }
}
