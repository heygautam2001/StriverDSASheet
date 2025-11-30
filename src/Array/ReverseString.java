package Array;

public class ReverseString {
    static boolean isPalindrome(int i , String str){
        if(i >= str.length()/2)
            return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1))
            return false;
        return isPalindrome(i+1,str);
    }
    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(isPalindrome(0,str));
    }
}
