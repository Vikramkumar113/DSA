
class MyStack{
    int cap;
    int top;
    int arr[];


    MyStack(int c)
    {
      cap = c;
      top = -1;
      arr = new int[cap];

    }

    void push(int x){
      top++;
      arr[top] = x;
    }

    int pop()
    {
      int res = arr[top];
      top--;
      return res;
    }

    int peek(){
       return arr[top];
    }

    int size(){
      return top+1;
    }

    boolean isEmpty()
    {
       return (top == -1);
    }

    void print()
    {
      for(int i=top; i>=0; i--)
      {
        System.out.print(arr[i]+" ");
      }
    }


}


public class stackUsingArray {
  public static void main(String[] args) {
    MyStack stack = new MyStack(5);

    stack.push(35);
    stack.push(50);
    stack.push(45);
    stack.push(39);

    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack.size());
    System.out.println(stack.isEmpty());
    stack.print();
    

  }


}
