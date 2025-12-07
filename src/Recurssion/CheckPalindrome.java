package Recurssion;

public class CheckPalindrome {
    //Recurssion1 =============================================================
    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right)
            return true;
        if (str.charAt(left) != str.charAt(right))
            return false;

        return isPalindrome(str, left + 1, right - 1);
    }

    //Recurssion2 ==================================================================
    public static boolean isPalindrome(String str, int left) {
        int n = str.length();
        if (left >= n / 2)
            return true;

        if (str.charAt(left) != str.charAt(n - left - 1))
            return false;

        return isPalindrome(str, left + 1);
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam", 0, "Madam".length() - 1));
        System.out.println(isPalindrome("naman", 0));
    }
}
