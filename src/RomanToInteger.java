/** Given a roman numeral, convert it to integer
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 */
public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "IIII";
        System.out.println(romanToInt(romanNumeral));
    }
    public static int romanToInt(String romanNumeral) {
        int integerValue = 0;
        int totalValue = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            switch (romanNumeral.charAt(i)) {

                // Symbol I case
                case 'I':
                    if (i + 1 < romanNumeral.length()) {
                        if (romanNumeral.charAt(i + 1) == 'V') {
                            integerValue = 4;
                            i++;
                            break;
                        } else if (romanNumeral.charAt(i + 1) == 'X') {
                            integerValue = 9;
                            i++;
                            break;
                        } else {
                            integerValue = 1;
                            break;
                        }
                    }
                    else {
                        integerValue = 1;
                        break;
                    }

                // Symbol V case
                case 'V':
                    integerValue = 5;
                    break;

                // Symbol X case
                case 'X':
                    if (i + 1 < romanNumeral.length()) {
                        if (romanNumeral.charAt(i + 1) == 'L') {
                            integerValue = 40;
                            i++;
                            break;
                        } else if (romanNumeral.charAt(i + 1) == 'C') {
                            integerValue = 90;
                            i++;
                            break;
                        }
                        else {
                            integerValue = 10;
                            break;
                        }
                    }
                    else {
                        integerValue = 10;
                        break;
                    }

                // Symbol L case
                case 'L':
                    integerValue = 50;
                    break;

                // Symbol C case
                case 'C':
                    if (i + 1 < romanNumeral.length()) {
                        if (romanNumeral.charAt(i + 1) == 'D') {
                            integerValue = 400;
                            i++;
                            break;
                        } else if (romanNumeral.charAt(i + 1) == 'M') {
                            integerValue = 900;
                            i++;
                            break;
                        }
                        else {
                            integerValue = 100;
                            break;
                        }
                    }
                    else {
                        integerValue = 100;
                        break;
                    }

                // Symbol D case
                case 'D':
                    integerValue = 500;
                    break;

                // Symbol M case
                case 'M':
                    integerValue = 1000;
                    break;
            }
            totalValue += integerValue;
        }
        return totalValue;
    }
}
