package singlyLinkedList;

public class LinkedListFunction<E> {
    Node<E> head;
    public void addFirst(E item) {
        Node<E> nn = new Node<E>(item);
        nn.data = item;
        nn.next = null;
        if (head == null) {
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;

    }



    public void removeFirst(){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;

        }
        head=head.next;

    }


    void removeLast(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        if(head.next==null){
            removeFirst();
            return;
        }
        Node <E>temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }
    void addAtParticular(E item,int index){
        Node<E> nn=new Node<E>(item);
        nn.data=item;
        nn.next=null;
        if(head==null&&index!=0){
            System.out.println("pls enter the item at   '0' index first as Linked List is empty ");
            return;

        }
        if(index==0){
            addFirst(item);
            return;
        }
        Node<E>temp=head,prev=head;
        int count=0;
        while(temp!=null&&count<index){
            prev=temp;
            temp=temp.next;
            count++;
        }
        prev.next=nn;
        nn.next=temp;

    }
    public void addLast(E item){
        Node <E>nn=new Node<E>(item);
        nn.data=item;
        nn.next=null;
        if(head==null){
            addFirst(item);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=nn;


    }
    public void display(){
        Node<E> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void mid(){
        Node <E>temp=head,temp1=head;
        int count=0;
        while (temp.next!=null){
            temp=temp.next;
            count++;
        }
        int middle=count/2,i=0;
        while(i<=middle){
            if(i==middle){
                System.out.println( temp1.data);
                return;
            }
            i++;
            temp1=temp1.next;

        }

    }
    void reverseLL(){

            if (head==null){
                return ;
            }
            Node <E>prev=null;
              Node <E>present=head;
            while (present!=null){
              Node <E>next=present.next;
              present.next=prev;
              prev=present;
              present=next;
            }

            head=prev;


    }


    private static class Node<E> {
        E data;
        Node <E>next;

        public Node(E data) {
            this.data=data;
            next = null;
        }

    }
}
