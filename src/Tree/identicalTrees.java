import java.util.ArrayList;

class Node{
  int data;
  Node left;
  Node right;

  public Node(int key)
  {
     data = key;
  }
}


public class identicalTrees {
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

      Node root1 = new Node(1);
    root1.left = new Node(2);
    root1.right = new Node(3);

   // System.out.println(answer(root, root1));
   System.out.println(isIdentical(root, root1));
  }


  //Naive approach
  // public static boolean answer(Node p, Node q)
  // {
  //   ArrayList<Integer> list1 = new ArrayList<>();
  //   ArrayList<Integer> list2 = new ArrayList<>();
  //   checkIdentical(p, list1);
  //   checkIdentical(q, list2);

  //   for(int i=0; i< list1.size();i++)
  //   {
  //      if(list1.get(i)!= list2.get(i))
  //      {
  //         return false;
  //      }
  //   }

  //   return true;
  // }
  // public static void checkIdentical(Node element, ArrayList<Integer> list)
  // {
  //   if(element== null)
  //   {
  //     return;
  //   }

  //   list.add(element.data);
  //   checkIdentical(element.left, list);
  //   checkIdentical(element.right, list);
  // }

  // efficient approach-
   public static boolean isIdentical(Node p, Node q)
   {
      if(p == null || q== null)
      {
         return p==q;
      }

      return (p.data == q.data) && isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
   }
}
