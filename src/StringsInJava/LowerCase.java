package StringsInJava;

import java.util.Scanner;

public class LowerCase {
    public static void toggle(String str){
        char [] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(ch[i] >= 65 && ch[i] <= 90){
                ch[i] = (char)(ch[i]+32);
            }
        }
        String ans = new String(ch);
        System.out.println(ans);

        System.out.println((char)('A'+25));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        toggle(str);
    }
}
