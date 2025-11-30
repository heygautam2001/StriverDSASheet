package GeeksForGeeks;

public class AddTwoBinaryNum {
    public static String addBinary(String s1 , String s2){
        int num1 = Integer.parseInt(s1 , 2);
        int num2 = Integer.parseInt(s2 , 2);

        int x = num1 + num2;
        String str = Integer.toBinaryString(x);
        return str;
    }
    public static void main(String[] args) {
        String s1 = "1000";
        String s2 = "1000";
        System.out.println(addBinary(s1,s2));

    }
}
