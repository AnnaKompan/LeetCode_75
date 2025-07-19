import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class ReverseVowels {
    public static void main(String[] args) {
        String s1 = "IceCreAm";
        String s2 = "leetcode";

        System.out.println("Reversed vowels string for " + s1 + " is " + reverseVowels(s1));
        System.out.println("Reversed vowels string for " + s2 + " is " + reverseVowels(s2));

    }

    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left <= right) {
            if (!vowels.contains(chars[left])) {
                left++;
            }
            else if (!vowels.contains(chars[right])) {
                right--;
            }
            else {
                chars[left] = chars[right];
                chars[right] = chars[left];
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
