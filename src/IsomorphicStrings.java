/**
 Given two strings s and t, determine if they are isomorphic.
 Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 All occurrences of a character must be replaced with another character while preserving the order of characters.
 No two characters may map to the same character, but a character may map to itself.
 **/
public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));


    }
    public static boolean isIsomorphic(String s, String t) {
        // Array for s and t strings
        int[] arrayStringS = new int[256];
        int[] arrayStringT = new int[256];

        // Iterate over string, comparing characters
        for (int i = 0; i < s.length(); i++) {
            if (arrayStringS[s.charAt(i)] != arrayStringT[t.charAt(i)]) {
                return false;
            }

            // Insert each character
            arrayStringS[s.charAt(i)] = i + 1;
            arrayStringT[t.charAt(i)] = i + 1;

        }
        return true;
    }
}
