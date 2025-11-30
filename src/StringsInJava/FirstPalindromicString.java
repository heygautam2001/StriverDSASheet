package StringsInJava;

public class FirstPalindromicString {
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String firstPalindrome(String[] words) {
        for(int i = 0 ; i < words.length ; i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }


    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
}
