package Basics;

public class PalindromeNumberII {
    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int i = 0;
        int j = num.length()-1;
        while(i <= j){
            if(num.charAt(i) != num.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
}
