/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some
 * (can be none) of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        // Convert strings to character arrays
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        if (s.length() < 1) {
            return true;
        }

        // Iterate over strings
        while (i < t.length()) {

            // Compare second string to first, increase first string position if equal
            if (tCharArray[i] == sCharArray[j]) {
                j++;
            }
            // Increase second position
            i++;
            if (j == s.length()) {
                return true;
            }
        }
        return false;
    }
}
