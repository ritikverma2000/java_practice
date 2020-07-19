package queue;

public class MyQueueLL<E> {
    Node<E>front,rear;
    void enqueue(E item){
        Node <E>nn=new Node<E>(item);
        nn.next=null;
        if(rear==null){
            front=nn;
            rear=nn;
            return;
        }else {
            rear.next = nn;
            rear = nn;
        }

    }
    E dequeue()throws Exception{
        Node<E>temp=front;
        if(front==null){

            throw new Exception("You cannot remove from a empty queue");
        }

            front= front.next;
        if(front==null) {
            rear = null;
        }


        return temp.data;
    }
    E peek()throws Exception{
        if(front==null){
            throw new Exception("That you cannot peek from an empty queue");

        }
        return front.data;

    }
    void display(){
        Node<E>temp=front;
        while(temp!=null){

            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    private static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data=data;
            next = null;
        }

    }
}
