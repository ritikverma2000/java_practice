package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass {
    public static void main(String[] args) throws Exception {
//        MyQueue q=new MyQueue(3);
//
//        q.Enqueue(5);
//        q.Enqueue(6);
//
//        q.Enqueue(7);
//
//        q.Dequeue();
//        q.Dequeue();
//        q.Dequeue();
//
//     q.peek();
        MyQueueLL<Integer>ll=new MyQueueLL<>();

        ll.enqueue(12);
        ll.enqueue(2);
        ll.enqueue(123);
        ll.enqueue(45);
        ll.dequeue();
        ll.dequeue();
        ll.dequeue();
        ll.dequeue();
        ll.enqueue(5);
        ll.display();





    }
}
