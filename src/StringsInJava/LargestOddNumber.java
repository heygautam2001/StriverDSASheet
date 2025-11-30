package StringsInJava;

public class LargestOddNumber {
    public static String LargestOddNumber(String num){
        int n = num.length();
        int max = 1;
        for (int i = 0; i < n; i++) {
            char ch = num.charAt(i);
            int numericValue = Character.getNumericValue(ch);
            if(numericValue % 2 != 0){
                max = Math.max(numericValue , max);
//                System.out.println(max);
            }
        }
//        System.out.println(max);
         String str = Integer.toString(max);
        return str;

    }
    public static void main(String[] args) {
        String str = "35427";
        System.out.println(LargestOddNumber(str));
        System.out.println(Integer.parseInt("21217"));
    }
}


