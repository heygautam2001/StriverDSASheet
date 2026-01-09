package StringsInJava;

public class AddStrings {
    public static String addStrings(String num1, String num2) {

        long temp1 = Long.parseLong(num1);
        long temp2 = Long.parseLong(num2);
        long temp3 = temp1 + temp2;
        return String.valueOf(temp3);
    }
    public static void main(String[] args) {
        System.out.println(addStrings("12343438546","123565879"));
    }
}
