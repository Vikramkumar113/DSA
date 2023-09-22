import java.util.LinkedList;

class MyStack2{
    LinkedList<Integer> ll = new LinkedList<>();
        
    void push(int x)
    {
      ll.add(x);
    }

    int pop()
    {
       return ll.pollLast();
    }

    int peek()
    {
       return ll.getLast();
    }

    int size(){
      return ll.size();
    }

    boolean isEmpty(){
       return ll.isEmpty();
    }


}


public class stackUsingLinkedList {
  public static void main(String[] args) {
    MyStack2 stack = new MyStack2();

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
