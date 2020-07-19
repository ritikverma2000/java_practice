package vectorAndStack;
public class MyStackUsingLL<E> {
    Node<E>head;
    boolean isEmpty(){
        if(head==null){
            return true;
        }else{
            return false;
        }
    }

    void push(E e){
        Node<E> nn=new Node<E>(e);
        nn.data=e;
        nn.next=null;
        if(head==null){
            head=nn;
            return;
        }
        nn.next=head;
        head=nn;



    }
    E pop()throws Exception{
        E popped;
        if(head==null){
            throw new Exception("The stack is empty");

        }else{
            popped=head.data;
            head=head.next;


        }
        return popped;

    }
    E peek()throws Exception{
        E top;
        if(head==null) {
            throw new Exception("Cannot peek as the stack is empty");
        }
        top=head.data;
        System.out.println(top);
        return top;
    }
    void display(){
        Node<E> temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    private static class Node<E> {
        E data;
        MyStackUsingLL.Node<E> next;

        public Node(E data) {
            this.data=data;
            next = null;
        }

    }
}
