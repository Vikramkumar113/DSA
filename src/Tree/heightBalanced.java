class Node{
  int data;
  Node left;
  Node right;

  public Node(int key)
  {
     data = key;
  }
}


public class heightBalanced {
  public static void main(String[] args) {
    Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	//root.right.left=new Node(60);
    	//root.right.right=new Node(70);
      root.left.left.left = new Node(4);
      root.left.left.right = new Node(4);


      System.out.println(isBalanced(root));
  }

  public static boolean isBalanced(Node root)
  {
       if(root == null) return true;
       int left = heightOfBinaryTree(root.left);
       int right = heightOfBinaryTree(root.right);

       if(!isBalanced(root.left) || !isBalanced(root.right)) return false;
       
       if(Math.abs(left-right) <= 1)
       {
          return true;
       }

       return false;
  }

  public static int heightOfBinaryTree(Node root)
  {
    if(root == null) return 0;

    int l = heightOfBinaryTree(root.left);
    int r = heightOfBinaryTree(root.right);

    return 1+ Math.max(l,r);
  }
}
