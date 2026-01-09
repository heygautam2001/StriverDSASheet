package StringsInJava;

// leet-code 3280
public class DateToBinaryString {
    public static String convertDateToBinary(String date) {
        String[] str = date.split("-",0);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length; i++){
            sb.append(Integer.toBinaryString(Integer.valueOf(str[i])));
            if(i != str.length - 1){
                sb.append("-");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(convertDateToBinary("2025-09-30"));
    }

}
