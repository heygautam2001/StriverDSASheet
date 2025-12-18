package StringsInJava;

public class RomanToInteger {
    public static int romanToInt(String s) {

        // Step 1:
        // Initialize result variable to store the final integer value
        int ans = 0;

        // Step 2:
        // Variable to store the numeric value of the current Roman character
        int num = 0;

        // Step 3:
        // Traverse the string from right to left
        // This helps easily handle subtractive cases like IV, IX, XL, etc.
        for (int i = s.length() - 1; i >= 0; i--) {

            // Step 4:
            // Convert current Roman character to its integer value
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }

            // Step 5:
            // If the current value is less than one-fourth of the total accumulated value,
            // it means this symbol should be subtracted (subtractive notation)
            // Example: I before V or X
            if (4 * num < ans) {
                ans -= num;
            }
            // Step 6:
            // Otherwise, add the value to the result
            else {
                ans += num;
            }
        }

        // Step 7:
        // Return the final converted integer
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XXX"));
    }
}
