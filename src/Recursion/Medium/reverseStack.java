import java.util.Stack;

public class reverseStack {
  public static void main(String[] args) {
     Stack<Integer> s = new Stack<>();
     s.push(3);
     s.push(2);
     s.push(1);
     s.push(7);
     s.push(6);
    // reverse(s);
    reverse1(s);

  }

  // Approach-1 iterative
  public static void reverse(Stack<Integer> s)
  {
     int size = s.size();
     for(int i=0; i<=size/2;i++)
     {
      int first = s.get(i);
      int last = s.get(size-i-1);

      s.set(i, last);
      s.set(size-i-1, first);
     }

     System.out.println(s);
  }

  // Approach-2 recursive
  public static void reverse1(Stack<Integer> s)
  {
       int size =s.size();
       reverseMyStack(s,0,size-1);
       System.out.println(s);
  }

  public static void reverseMyStack(Stack<Integer> s, int first, int last){
       if(first >= last)
       {
         return;
       }

       int temp = s.get(first); // Store the value to be swapped
        s.set(first, s.get(last));
        s.set(last, temp);

       reverseMyStack(s, first+1, last-1);
  }
  
}
