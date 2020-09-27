package queue;

public class MyQueue{
    private static int head, rear, capacity;
    private static int queue[];
    public MyQueue(int max){
        capacity=max;
        queue = new int[capacity];
         head=rear=0;

    }





    void Enqueue(int item){

        if(rear==queue.length){
            System.out.println("The Queue is full!!");
            return;

        }

        else{
            queue[rear]=item;
            rear++;

        }


    }
    int peek(){
        if(head==rear){
            System.out.println("No element to peek as the queue is empty");
            return -1;
        }
        return queue[head];
    }
    int Dequeue(){
        if (head==rear){
            System.out.println("You cannot remove from a empty queue");
            return -1;
        }
        return head++;

    }
    void display(){
        if (head == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        for (int i=head;i<rear;i++){
            System.out.print(queue[i]+" ");
        }
    }

}
