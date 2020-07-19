package String;

public class StringAnagramBetter {
    public static void main(String[] args) {
        String a="ccc";
        String b="cbb";
        boolean isAnagram=true;
        int al[]=new int[256];
        for (char c: a.toCharArray()) {
            int index=(int) c;
            al[index]++;
        }
        for (char c:b.toCharArray()){
            int index=(int)c;
            al[index]--;
        }
        for (int i=0;i<256;i++){
            if (al[i]!=0){
                isAnagram=false;
                break;
            }
        }
        if (isAnagram){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}
