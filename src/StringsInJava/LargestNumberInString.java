package StringsInJava;

public class LargestNumberInString {
    public static void main(String[] args) {
        String str = "012845";
        int max = 1;
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            max = Math.max(ch , max);
        }

        System.out.println(Character.toString((char)(max)));
    }
}
