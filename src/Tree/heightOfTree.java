import java.util.LinkedList;
import java.util.Queue;

class Node{
  int data;
  Node left;
  Node right;

  public Node(int key)
  {
     data = key;
  }
}

public class heightOfTree {
  public static void main(String[] args) {
    Node root=new Node(0);
    root.left=new Node(2);
    root.right=new Node(4);
    root.left.left=new Node(1);
   // root.left.right=new Node();
    root.right.left=new Node(3);
    root.right.right=new Node(-1);
    root.left.left.left = new Node(5);
    root.left.left.right = new Node(1);
     root.right.left.right=new Node(6);
      root.right.right.right =new Node(8);



    System.out.println(heightOfBinaryTree(root));

  }
// Naive approach
  public static int heightOfBinaryTree(Node root)
  {
      // if(root == null) return;
      // Queue<Node> q = new LinkedList<>();
      // q.add(root);
      // int count =0;
      // while(!q.isEmpty())
      // {
      //    int size = q.size();
      //       while(size-- > 0){
      //       Node curr = q.poll();
      //       if(curr.left!=null) q.add(curr.left);
      //       if(curr.right!=null) q.add(curr.right);
      //     }
      //     count++;
    
      // }

      // System.out.println(count);



      //efficient
       if(root == null) return 0;

       int l = heightOfBinaryTree(root.left);
       int r = heightOfBinaryTree(root.right);

       return 1+ Math.max(l,r);

  }
}
