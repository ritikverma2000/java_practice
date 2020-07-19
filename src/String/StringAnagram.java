package String;

public class StringAnagram {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aab";
        boolean visited[]=new boolean[s2.length()];
        if (s1.length() != s2.length()) {
            System.out.println("Not anagram");
        } else {
            boolean isAnagram=false;
            for (int i = 0; i < s1.length(); i++) {
                char c=s1.charAt(i);
                 isAnagram=false;
                for (int j = 0; j < s2.length(); j++) {
                    if(s2.charAt(j)==c&&!visited[j]){
                        visited[j]=true;
                        isAnagram=true;
                        break;
                    }
                }if (!isAnagram){
                    break;

                }
            }
            if (isAnagram){
                System.out.println("Anagram");
            }else{
                System.out.println("Not Anagram");
            }
        }
    }
}
