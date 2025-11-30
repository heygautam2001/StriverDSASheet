package StringsInJava;

public class toggleString {
    public static String toggle(String str){
        String gtr = "";
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            if(ascii >= 65 && ascii <= 90){
               gtr = gtr + (char)(ascii+32);
            }else{
               gtr = gtr + (char)(ascii-32);
            }
        }
        return gtr;
    }

    public static void main(String[] args) {
        String str = "HelloGautam";
        System.out.println(str);
        System.out.println(toggle(str));
//        System.out.println((int)('z'));
    }
}
