public class diameterOfTree {
  public static void main(String[] args) {
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.right.left=new Node(3);
    root.right.left.left=new Node(-1);
    root.right.left.left.left = new Node(5);
    root.right.right = new Node(6);
    root.right.right.right =new Node(8);
    root.right.right.right.right = new Node(6);

    System.out.println(diameter(root));
  }


  // naive approach
  // public static int diameter(Node root)
  // {
  //       if(root == null) return 0;
  //       int left = heightOfBinaryTree(root.left);
  //       int right = heightOfBinaryTree(root.right);
        
  //       int ans = Math.max(left+right, diameter(root.left)+diameter(root.right));
  //       return ans;
        
        
  // }

  // public static int heightOfBinaryTree(Node root)
  // {
  //   if(root == null) return 0;

  //   int l = heightOfBinaryTree(root.left);
  //   int r = heightOfBinaryTree(root.right);

  //   return 1+ Math.max(l,r);
  // }

  //efficient approach
  public static int  diameter(Node root)
  {
      int diameter[] = new int[1];  
      /* if we use variable instead of diameter array we will get value as 0 because variables are passing copy of original value
         to the function so when function return after execution it executes next line that is return <variable name> so our original value is 0 so answer
         will give 0.

         but if we use array then array are passing their original value so we will get our answer.
       */
      findMax(root, diameter);
      return diameter[0];
  }

  public static int findMax(Node root, int diameter[])
  {
     if(root == null){
      return 0;
     }

     int lh = findMax(root.left, diameter);
     int rh = findMax(root.right, diameter);
     diameter[0] = Math.max(diameter[0],lh+rh);

     return 1+Math.max(lh,rh);
  }


}
