package methods;

public class Introduction {
    public static void main(String[] args) {
        int first=34,second=2;
        int result=maxOf(first,second);
        System.out.println(result);

    }
    static int maxOf(int a ,int b){
     if(a>b){
         return a;
     }else{
         return b;
     }
    }
}
