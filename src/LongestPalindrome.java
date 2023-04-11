/**Given a string s which consists of lowercase or uppercase letters, return the length of the longest
 palindrome that can be built with those letters.
 Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        String string = "abccccdd";
        System.out.println(longestPalindrome(string));
    }

    public static int longestPalindrome(String string) {

        // Initialise variable for character frequency
        int[] characterFrequency = new int[128];

        // Variable for odd numbered characters, one letter may appear an odd number of times
        int oddCount = -1;

        // Convert string to character array
        char[] characterArray = string.toCharArray();

        // Iterate over character array, counting number of individual characters
        for (char c: characterArray) {
            characterFrequency[c]++;
        }

        // Count the frequency for odd numbered characters
        for (int i : characterFrequency) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }

        // The longest palindrome is equal to the number of all characters, less the number of characters that appear
        // an odd number of times

        if (oddCount > 0) {
            return string.length() - oddCount;
        }
        return string.length();
    }
}
