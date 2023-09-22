import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class zigzagTraversal {
  public static void main(String[] args) {
    Node root = new Node(3);
    root.left = new Node(9);
    root.right = new Node(20);
    root.right.left = new Node(15);
    root.right.right = new Node(7);

    System.out.println(zigziagLeveOrderTraversal(root));

  }

  public static ArrayList<ArrayList<Integer>> zigziagLeveOrderTraversal(Node root)
  {
      ArrayList<ArrayList<Integer>> result = new ArrayList<>();
     if(root == null) return result;
      Queue<Node> q = new LinkedList<>();
      int level=0;
      q.add(root);
      while(!q.isEmpty())
      {
        int size = q.size();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<size;i++)
        {
            Node curr = q.poll();
            ans.add(curr.data);

            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }

        if(level%2==1)
        {
           Collections.reverse(ans);
        }

        result.add(ans);
        level++;
      }

      return result;
  }
}
