package StringsInJava;
// leet-code 709
public class ToLowerCase {
    public static String toLowercase(String s){
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < s.length() ; i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                int ascii = (int) str.charAt(i);
                str.setCharAt(i, (char) (ascii + 32));
            }
        }

        return str.toString();

    }
    public static void main(String[] args) {
        System.out.println(toLowercase("LOxcY"));
    }
}
