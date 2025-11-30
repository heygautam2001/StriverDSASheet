package StringsInJava;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String str){
        String gtr = str.trim();
        int n = gtr.length();
        int len = 0;
        for (int i = n-1; i >= 0 ; i--) {
            if(gtr.charAt(i) != ' ')
                len++;
            else
                break;
        }

        return len;
    }
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(lengthOfLastWord(str));
    }
}
