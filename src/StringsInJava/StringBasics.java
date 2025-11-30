package StringsInJava;

import java.util.Arrays;

public class StringBasics {
    public static void main(String[] args) {
        String str = "Gautam";
//        String strr = "Gautam";
//        strr = new String("Gautam");
        // Operations on  string
        // Printing the String
//        System.out.println(str);
        // Traversing through a string
        // with for loop

//        for (int i = 0; i < str.length() ; i++) {
//            System.out.println(str.charAt(i));
//        }

        // with for-each loop
//        for (var ele : str){
//            Foreach not applicable to type 'java.lang.String
//        }


        // with while loops
//        int i = 0;
//        while(i < str.length()){
//            System.out.println(str.charAt(i)+" ");
//            i++;
//        }

        // Methods of string
        // Adding two string
        String gtr = str.concat(" Hello");
        // original string will not change because string is immutable.
//        System.out.println(str);
        // Here new String will be created and stored in a variable.

        String str1 = str.toLowerCase(); // ,converts the string into lower case and returns a new string.
//        System.out.println(str);
//        System.out.println(str1);

        String str2 = str.toUpperCase();
//        System.out.println(str);
//        System.out.println(str2);

        // finding the character at specific index...
        char ch = str.charAt(2);
//        System.out.println(ch);

        // Finding the index of a specific character in string
        int idx = str.indexOf('u');
//        System.out.println(idx);
        idx = str.indexOf('a' , 2);
//        System.out.println(idx);
        idx = str.indexOf('a',2,5);
//        System.out.println(idx);

        // check whether the specific part is present in the string or not
        boolean bool = str.contains("Ga");
//        System.out.println(bool);

        boolean bool1 = str.contains("Xa");
//        System.out.println(bool1);

        // length of the string
        int length = str.length();
//        System.out.println(length);

        // -----------------------------------------------------------------

        //comparing two string -- .equals() and .compareTo()
//        System.out.println(str == str1);
//        System.out.println(str == strr);

        String s = "Hello";
        String st = "Hello";
//        System.out.println(s == st); // true
        s = "mello";
//        System.out.println(s == st); // false

        String xxx = "Hello";
        String yyy = new String("Hello");
//        System.out.println(xxx);
//        System.out.println(yyy);

//        System.out.println(xxx == yyy);
//        System.out.println(xxx.equals(yyy));
        System.out.println(xxx.equalsIgnoreCase(yyy));
//--------------------------------------------------------------------------------

        String a = "HELzo";
        String b = "MeLzo";
//        System.out.println(b.compareTo(a)); //5
//        System.out.println(a.compareTo(b)); //-5
        System.out.println(a.compareToIgnoreCase(b));


// ----------------------------------------------------------------------------

        String s3 = "HelloWorld";
//        System.out.println(s3.indexOf('W'));
//        System.out.println(s3.indexOf('l' , s3.indexOf('l')+1));
//        System.out.println(s3.lastIndexOf('l'));
//        System.out.println(s3.lastIndexOf('l' , s3.lastIndexOf('l')-1));

          String s4 = "   ";
//        System.out.println(s4.isBlank());
//        System.out.println(s3.isBlank());

        char[]ch1 = s3.toCharArray();
        System.out.println(Arrays.toString(ch1));


        String string = "  Hello Gautam  ";
        System.out.println(string.trim());
//        System.out.println(string.);



    }
}
