import java.util.Arrays;

/**
 * For example, two is written as II in Roman numeral, just two one's added together.
 * Twelve is written as, XII, which is simply X + II.
 * The number twenty seven is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * <p>
 * romanToInt("III"); // => 3
 * romanToInt("LVIII"); // => 58
 * romanToInt("IX"); // => 9
 * romanToInt("MCMXCIV"); // => 1994
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("III")); // => 3
        System.out.println(romanToInt("LVIII")); // => 58
        System.out.println(romanToInt("IX")); // => 9
        System.out.println(romanToInt("MCMXCIV")); // => 1994
    }

    public static int romanToInt(String roman) {
        final int number_of_chars = roman.length();
        final char[] roman_as_chars = roman.toCharArray();
        final int[] roman_as_ints = new int[number_of_chars];

        for( int i = 0; i < roman.length(); i++ ) {
            switch ( roman_as_chars[i] ) {
                case 'I' -> roman_as_ints[i] = 1;
                case 'V' -> roman_as_ints[i] = 5;
                case 'X' -> roman_as_ints[i] = 10;
                case 'L' -> roman_as_ints[i] = 50;
                case 'C' -> roman_as_ints[i] = 100;
                case 'D' -> roman_as_ints[i] = 500;
                case 'M' -> roman_as_ints[i] = 1000;
            }
        }

        return Arrays.stream(roman_as_ints).sum();
    }
}
