package StringsInJava;

public class LongestPalindromicSubstring {
    public static boolean isPalindrome(String str){
        int i = 0; int j = str.length()-1;
        while(i<=j){
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static String longestPalindrome(String s ){
        int maxlen = 0;
        String str = "";
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i+1; j <= s.length() ; j++) {
               String gtr = s.substring(i,j);
                if (isPalindrome(gtr)){
                    int len = gtr.length();
                    maxlen = Math.max(len , maxlen);
                    System.out.println(maxlen);
                    if (true){
                    str = s.substring(i,j);}
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("dkkfabans"));
//        System.out.println(isPalindrome("nitin"));
    }
}
