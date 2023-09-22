class Node{
  int data;
  Node left;
  Node right;

  public Node(int key)
  {
     data = key;
  }
}

public class treeRepresentation{
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    traversal(root);
  }


  // Recursive approach
  public static void traversal(Node root)
  {
    if(root == null)
    {
      return;
    }

    //preorder(root + left+ right)
    // System.out.println(root.data);
    // traversal(root.left);
    // traversal(root.right);

    //inorder (left + root+ right)
    // traversal(root.left);
    // System.out.println(root.data);
    // traversal(root.right);

    //postorder (left + right + root)
    //  traversal(root.left);
    // traversal(root.right);
    // System.out.println(root.data);

  }


}