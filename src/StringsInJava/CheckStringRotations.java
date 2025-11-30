package StringsInJava;

public class CheckStringRotations {
    public boolean rotateString(String str, String goal) {
        if (str.length() != goal.length()) return false;

        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.equals(goal)) {
                return true;
            }
            // rotate left by one character
            char ch = str.charAt(0);
            str = str.substring(1) + ch;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "efabcd";
        String gtr = "abcdef";
        System.out.println(areRotation(str , gtr));

    }

    private static boolean areRotation(String str, String gtr) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if(str.equals(gtr))
                return true;
            char lastchar = str.charAt(n-1);
            str = lastchar + str.substring(0 , str.length()-1);
        }
        return  false;
    }
// Optimized
    public boolean rotateStrings(String str, String goal) {
        return str.length() == goal.length() && (str + str).contains(goal);
    }

}
