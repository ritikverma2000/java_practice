package vectorAndStack;

public class MainClass {
    public static void main(String[] args) throws Exception {
//        Vector<Integer>v=new Vector<>();
//        v.add(34);
//        v.add(45);
//        Stack<Integer>stack=new Stack<>();
//        stack.push(12);
//        stack.push(24);
//        stack.push(36);
//        int popped=stack.pop();
//      int peeked=stack.peek();
//
//        System.out.println(popped+" "+peeked);
//        MyStackUsingArray mf=new MyStackUsingArray();
//        mf.push(10);
//        mf.push(20);
//        mf.pop();
//        mf.pop();
//
//        System.out.println(mf.peek());
        MyStackUsingLL<String>msll=new MyStackUsingLL<>();
        msll.push("ritik");
        msll.push("riya");
        msll.push("raju");
        msll.push("hello");
        msll.pop();
msll.display();


    }
}
