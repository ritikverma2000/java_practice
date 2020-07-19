package String;

public class StringBuilderExample2 {
    public static void main(String[] args) {
        String s1="The sky is Blue";
        StringBuilder sb=new StringBuilder();
        //        int count=0;
//        for (int i=1;i<sb.length();i++){
//            if (sb.charAt(i)==sb.charAt(i-1)){
//                sb.deleteCharAt(i);
//                sb.deleteCharAt(i-1);
//                count++;
//
//            }
//
//
//        }
       int i=s1.length()-1;
       while(i>=0){
           while(i>=0 && s1.charAt(i)==' ') i--;
           int j=i;
           if(i<0)break;
           while(i>=0 &&  s1.charAt(i)!=' ')i--;
           if(s1.isEmpty()) {
               sb.append(s1.substring(i + 1, j + 1));
           }
           else{
               sb.append(" "+s1.substring(i + 1, j + 1));
           }
       }





        System.out.println(sb);


    }
}
