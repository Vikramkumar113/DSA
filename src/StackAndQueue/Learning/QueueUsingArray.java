class Queue{
    int arr[];
    int size;
    int cap;
    
   Queue(int c){
     cap = c;
     size = 0;
     arr = new int[cap];
   }

    boolean isFull(){
      return size == cap;
   }

    boolean isEmpty(){
      return size ==0;
   }

   void enqueue(int x)
   {
      if(isFull()) return;
      arr[size] = x;
      size++;
   }

    void dequeue(){
      if(isEmpty())
      {
        return;
      }
      for(int i= 0; i < size-1; i++)
      {
          arr[i] = arr[i+1];
      }

      size--;

      return;
   }

    int getFront()
   {
     if(isEmpty()){
       return -1;
     }

     return arr[0];
   }

   void display()
   {
       for(int i=0; i< size;i++)
       {
         System.out.println(arr[i]);
       }
   }

   int getRear(){
     if(isEmpty()){
       return -1;
     }

     return arr[size-1];
   }
}

public class QueueUsingArray {
  public static void main(String[] args) {
    Queue q = new Queue(5);

    q.enqueue(34);
    q.enqueue(45);
    q.enqueue(39);
    q.enqueue(48);
    q.enqueue(78);

   
    
    q.dequeue();

    System.out.println(q.getFront());
    System.out.println(q.getRear());

    System.out.println(q.isFull());

    q.display();


  }
}
