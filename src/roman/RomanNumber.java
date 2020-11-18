package roman;

public class RomanNumber {

    public static int romanToInt(String roman) {
        int result = 0;
        String romanToUpperCase = roman.toUpperCase();
        for (int i = 0; i < romanToUpperCase.length() - 1; i++) { //loop over all except last character
            // lower value than the next character
            if (decode(romanToUpperCase.charAt(i)) < decode(romanToUpperCase.charAt(i + 1))) {
                // substract
                result -= decode(romanToUpperCase.charAt(i));
            } else {
                // add
                result += decode(romanToUpperCase.charAt(i));
            }
        }
        // decode the last character ( always added )
        result += decode(romanToUpperCase.charAt(romanToUpperCase.length() - 1));
        return result;
    }

    private static int decode(char letter) {
        switch (letter) {
            case 'M' -> {
                return 1000;
            }
            case 'D' -> {
                return 500;
            }
            case 'C' -> {
                return 100;
            }
            case 'L' -> {
                return 50;
            }
            case 'X' -> {
                return 10;
            }
            case 'V' -> {
                return 5;
            }
            case 'I' -> {
                return 1;
            }
            default -> {
                return 0;
            }
        }
    }
}
