

public class ReverseWords {
    public static void main(String[] args){
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        System.out.println("Reversed order of string " + s1 + " is " + reverseWords(s1));
        System.out.println("Reversed order of string " + s2 + " is " + reverseWords(s2));
        System.out.println("Reversed order of string " + s3 + " is " + reverseWords(s3));
    }
    
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) {
                res.append(" ");
            }
        }
        return res.toString().trim();
    }
}
