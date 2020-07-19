package String;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
       sb.append("aBcDe");
        for (int i=0;i<sb.length();i++){
            if(sb.charAt(i)>=97&&sb.charAt(i)<=122){
                sb.setCharAt(i, (char) (sb.charAt(i)-32));

            }
            else if (sb.charAt(i)>=65&&sb.charAt(i)<=90){
                sb.setCharAt(i,(char)(sb.charAt(i)+32));

            }
        }
        System.out.println(sb);

    }
}
