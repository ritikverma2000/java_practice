package doubleEndedQueue;

public class MyDeque <E>{
    Node<E>head,tail;
    void addFirst(E item) {
        Node<E> nn = new Node<E>(item);
        nn.data=item;
        nn.next = null;
        nn.prev = null;

        if (head == null) {
            tail = nn;
            head = nn;
            return;

        }
        nn.next=head;
        head.prev=nn;
        head=nn;

    }
    E getFirst()throws Exception{
        if(head==null){
            throw new Exception("You cannot peek the element from a empty deque");
        }
        return head.data;

    } E getLast()throws Exception{
        if(tail==null){
            throw new Exception("You cannot peek the element from a empty deque");
        }
        return tail.data;

    }

    E removeFirst()throws Exception{
        Node<E>temp=head;
        if(head==null){
            throw new Exception("You cannot remove from an empty deque");
        }
        head=head.next;
        if (head==null){
            tail=null;
        }else {
            head.prev = null;
            temp.next = null;
        }
        return temp.data;

    }
    E removeLast()throws Exception{
        Node<E>temp=tail;
        if(tail==null){
            throw new Exception("You cannot remove from an empty deque");
        }
        tail=tail.prev;
        if(tail==null){
            head=null;

        }else {
            tail.next = null;
            temp.prev = null;

        }
        return temp.data;
    }
    void addLast(E item){
        Node<E>nn=new Node<E>(item);
        nn.next=null;
        nn.prev=null;
        if(tail==null){
            head=nn;
            tail=nn;
            return;
        }
        nn.prev=tail;
        tail.next=nn;
        tail=nn;
    }
    void display(){
        Node<E>temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }


    }

    private static class Node<E>{
        E data;
        Node<E>next,prev;

        public Node (E data){
            this.data=data;
            this.next=this.prev=null;
        }
    }
}
