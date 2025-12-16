package StringsInJava;

import java.util.Scanner;
import java.util.Stack;
// leet-code 1021
public class RemoveOutermostParenthesis {
    public static String removeOutmostParenthesis(String str){
        String str1 = "";
        for (int i = 1; i < str.length()-1 ; i++) {
            str1 += str.charAt(i);
        }
        return str1;
        // Not correct solutions
    }
    public static String removeOutermostParenthesis(String str){
        // Take a stack
        // 1. if(ch == ')') st.pop();
        // 2. if(!st.isEmpty()) ans+= ch;
        // 3. if(ch == '(') st.push(ch);

        Stack <Character> st = new Stack<>();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')') st.pop();
            if(!st.isEmpty()) ans = ans+=ch;
            if(ch == '(') st.push(ch);
        }
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        System.out.println(removeOutermostParenthesis(str));

    }
}
/*Not correct solution*/