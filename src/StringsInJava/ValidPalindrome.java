package StringsInJava;

public class ValidPalindrome {
    public static String extraction(String str){
         String gtr = str.toLowerCase();
         String helper = "";
        for (int i = 0; i < str.length(); i++) {
            if (gtr.charAt(i) >= 'a' && gtr.charAt(i) <= 'z' || gtr.charAt(i) <= '0' && gtr.charAt(i) >= '9'){
                helper+=gtr.charAt(i);
            }
        }
        return helper;
    }

    public static boolean checkPalindrome(String str ){
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindrome(String s) {
       String str = extraction(s);
       return checkPalindrome(str);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(extraction("0P"));

    }
}
