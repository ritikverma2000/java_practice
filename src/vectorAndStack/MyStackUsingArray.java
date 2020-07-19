package vectorAndStack;

import java.util.Stack;

public class MyStackUsingArray {
    //stack using array
    final int max=1000;
    int top;
    int arr[]=new int[max];
    boolean isempty(){
        return (top<0);
    }
    MyStackUsingArray(){
        top=-1;
    }

    boolean push(int e){
        if (top>=(max-1)){
            System.out.println("Stack overflow");
            return false;
        }else{
            arr[++top]=e;
            return true;

        }

    }
    int pop(){
        if (top<0){
            System.out.println("stack is empty");
            return 0;

        }else{
            int e=arr[top--];
            return e;

        }

    }
    int peek(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int e=arr[top];
            return e;
        }

    }
}
