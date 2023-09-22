import java.util.ArrayList;

class MyStack1{
    ArrayList<Integer> al = new ArrayList<Integer>();

    void push(int x)
    {
      al.add(x);
    }

    int pop()
    {
       int res = al.remove(al.size()-1);
       return res;
    }

    int peek()
    {
       return al.get(al.size()-1);
    }

    int size(){
      return al.size();
    }

    boolean isEmpty(){
       return al.isEmpty();
    }
}

public class stackUsingArrayList {
  public static void main(String[] args) {
     MyStack1 stack = new MyStack1();
     
    stack.push(35);
    stack.push(50);
    stack.push(45);
    stack.push(39);

   System.out.println(stack.pop());
   System.out.println(stack.peek());
    System.out.println(stack.size());
     System.out.println(stack.isEmpty());
    
  }
}
