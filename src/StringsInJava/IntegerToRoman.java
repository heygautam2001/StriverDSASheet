package StringsInJava;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        // Step 1:
        // Store all possible integer values in descending order
        // These values cover both normal and subtractive Roman cases
        int[] val = {
                1000, 900, 500, 400,
                100, 90, 50, 40,
                10, 9, 5, 4, 1
        };

        // Step 2:
        // Corresponding Roman symbols for each integer value
        String[] sym = {
                "M", "CM", "D", "CD",
                "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"
        };

        // Step 3:
        // StringBuilder to efficiently build the Roman numeral result
        StringBuilder result = new StringBuilder();

        // Step 4:
        // Traverse through each value from largest to smallest
        for (int i = 0; i < val.length; i++) {

            // If number becomes 0, conversion is complete
            if (num == 0) {
                break;
            }

            // Step 5:
            // Find how many times the current value fits into num
            int times = num / val[i];

            // Step 6:
            // Append the corresponding Roman symbol 'times' times
            while (times-- > 0) {
                result.append(sym[i]);
            }

            // Step 7:
            // Reduce num by removing the value already converted
            num = num % val[i];
        }

        // Step 8:
        // Return the final Roman numeral string
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(455));
    }
}
