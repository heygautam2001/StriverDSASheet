package StringsInJava;
// Leet code 2129
public class CapitalizeTheTitle {
    public static String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        // str is our resultant string...
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.length()<=2){
                str.append(word);
            }else{
               str.append(Character.toUpperCase(word.charAt(0)));
               str.append(word.substring(1).toLowerCase());
            }
            if (i < str.length()-1){
                str.append(" ");
            }
        }
  return str.toString();
    }
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("caPatilIze tHe Title of"));
    }


}
