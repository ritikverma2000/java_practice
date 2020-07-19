package String;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        for (int j = 0; j < t; j++) {
            String s1=s.nextLine();
            boolean isBalanced=true;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s1.length(); i++) {

                if (s1.charAt(i) == '{' || s1.charAt(i) == '[' || s1.charAt(i) == '(') {
                    stack.push(s1.charAt(i));

                }
                if (stack.isEmpty()){
                    isBalanced=false;
                }

                if (s1.charAt(i) == ']' ) {
                    if (stack.peek() == '[') {
                        stack.pop();
                    }else{
                        isBalanced=false;
                        break;
                    }
                }

                if (s1.charAt(i) == '}'){
                    if(stack.peek() == '{') {
                        stack.pop();
                    }else {
                        isBalanced=false;
                    }
                }
                if (s1.charAt(i) == ')' ){
                    if( stack.peek() == '(') {
                        stack.pop();

                    }else{
                        isBalanced=false;
                    }
                }


            }
            if (!stack.isEmpty()) {
                isBalanced=false;

            } if (isBalanced){
                System.out.println("balanced");
            }else {
                System.out.println("not balanced");
            }
        }
    }
}
