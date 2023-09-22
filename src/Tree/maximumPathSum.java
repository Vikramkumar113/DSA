class Node{
  int data;
  Node left;
  Node right;

  public Node(int key)
  {
     data = key;
  }
}


public class maximumPathSum {
  public static void main(String[] args) {
    Node root=new Node(-10);
    root.left=new Node(9);
    root.right=new Node(20);
    root.right.left=new Node(15);
    root.right.right=new Node(7);
   

    System.out.println(maximumPathInBS(root));
  }

  public static int  maximumPathInBS(Node root)
  {
      int maxPath[] = new int[1];
      maxPath[0]  = Integer.MIN_VALUE;
      findMax(root, maxPath);
      return maxPath[0];
  }

  public static int findMax(Node root, int maxPath[])
  {
     if(root == null){
      return 0;
     }

     int lh = findMax(root.left, maxPath);
     int rh = findMax(root.right, maxPath);
    
     maxPath[0] = Math.max(maxPath[0], (lh+rh+root.data));

     return root.data +Math.max(lh,rh);
  }

}
