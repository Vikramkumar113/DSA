import java.util.LinkedList;

class QueueLinkedList{
     LinkedList<Integer> ll = new LinkedList<>();

     void enqueue(int x)
     {
        ll.add(x);
     }

     int dequeue(){
        return ll.pollFirst();
     }

     int size(){
      return ll.size();
     }

     int getFront(){
       if(isEmpty()) return -1;
       return ll.peekFirst();
     }

     int getRear(){
      if(isEmpty()) return -1;
      return ll.peekLast();
     }

     boolean isEmpty(){
      return ll.isEmpty();
     }

     void display(){
       for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println("");
     }

}


public class QueueUsingLinkedList {
  public static void main(String[] args) {
    QueueLinkedList q = new QueueLinkedList();

    q.enqueue(34);
    q.enqueue(36);
    q.enqueue(67);
    q.enqueue(87);
    q.enqueue(54);
    q.enqueue(90);

    //q.display();
    System.out.println(q.dequeue());
    q.display();
    System.out.println(q.getFront());
    System.out.println(q.getRear());



  }
}
