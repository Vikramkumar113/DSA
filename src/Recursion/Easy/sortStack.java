
import java.util.Arrays;
import java.util.Stack;

public class sortStack {
  public static void main(String[] args) {
   Stack<Integer> s= new Stack<>();
     s.push(3);
     s.push(2);
     s.push(1);
     s.push(7);
     s.push(6);
   sortStackUsingRecursion(s, s.size());
   System.out.println(s);
  
    
  }


  // Approach - Using bubble sort
  public static void sortStackUsingRecursion(Stack<Integer> s, int n)
  {

        if( n== 1)
        {
           return;
        }
       for(int j=1; j< n; j++)
        {
           if(s.get(j) < s.get(j-1))
           {
            int temp = s.get(j); // Store the value to be swapped
            s.set(j, s.get(j-1));
            s.set(j-1, temp);
           }
        }

        sortStackUsingRecursion(s, n-1);
  }
  
}
