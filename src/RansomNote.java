public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aa";

        System.out.println(canConstruct(ransomNote, magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {

        int magazineStringLength = magazine.length();
        int ransomStringLength = ransomNote.length();
        StringBuilder magazineStringBuilder = new StringBuilder(magazine);
        int comparisonCounter = 0;
        boolean canConstruct = false;

        // Iterate over magazine string and compare to entire ransomNote string
        // If charAt from magazine matches in ransomNote, increase counter and remove matching characters
        for (int i = 0; i < ransomStringLength; i++) {
            for (int j = 0; j < magazineStringLength; j++) {
                if (ransomNote.charAt(i) == magazineStringBuilder.charAt(j)) {
                    magazineStringBuilder.setCharAt(j,' ');
                    comparisonCounter++;
                    break;
                }
            }
        }
        // If number of matching characters removed >= length of ransom string, canConstruct = true
        if (comparisonCounter >= ransomStringLength) {
            canConstruct = true;
        }

        return canConstruct;
    }
}
