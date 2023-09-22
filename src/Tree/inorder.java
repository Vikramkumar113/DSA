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


public class inorder {
  public static void main(String[] args) {
      Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
    	root.right.right=new Node(70);

      inorderTraversal(root);
  }

  public static void inorderTraversal(Node root)
  {
      if(root == null) return;
      Stack<Node> st = new Stack<Node>();
      Node curr = root;
      while(curr!=null || !st.isEmpty())
      {
          while(curr!=null)
          {
            st.push(curr);
            curr = curr.left;
          }
          curr= st.pop();
          System.out.println(curr.data+" ");
          curr = curr.right;
      }
  }
}
