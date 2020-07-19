package String;

public class PermutationOfString {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("abc");
    permutation(s1);
    }

    private static void permutation(StringBuilder s1) {
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s1.length()-1 ; j++) {
                if (j != i) {
                    char temp = s1.charAt(j);
                    s1.setCharAt(j, s1.charAt(j + 1));
                    s1.setCharAt(j + 1, temp);

                }


            }

        }
        permutation(s1);

    }
}
