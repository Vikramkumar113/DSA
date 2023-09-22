class CircularQueue{
   int arr[];
   int front, rear, size;
   int cap;


   CircularQueue(int c){
      cap = c;
      arr = new int[cap];
      size = 0;
   }

   boolean isEmpty(){
       return front == rear;
   }

   boolean isFull(){
        return cap == rear;
   }

   void enqueue(int x){
        if(isFull()) return;

        arr[rear%cap] = x;
        rear++; 
        size++;
   }

   int dequeue(){
        if(isEmpty()) return -1;

        int popped = arr[front%cap];
        front++;
        size--;

        return popped;

   }

   int getFront(){
            if(isEmpty()) return -1;

            return arr[front%cap];
   }

   int getRear(){
           if(isEmpty()) return -1;

           return arr[(front+size-1)%cap];
   }

  
  }






public class circularQueueUsingArray {
  public static void main(String[] args) {
     CircularQueue cq =  new CircularQueue(5);

     cq.enqueue(45);
     cq.enqueue(67);
     cq.enqueue(41);
     cq.enqueue(63);
     cq.enqueue(44);
    
     System.out.println(cq.dequeue());
     cq.enqueue(23);
     System.out.println(cq.getRear());


  }


}
