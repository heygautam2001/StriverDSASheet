package StringsInJava;

public class StringBuilders {
    public static void main(String[] args) {
        // All the String Method are work in StringBuilder...
        // Also, StrinBuilder has it own method...
        // It is not thread safe...
        // It is mutable...
        StringBuilder s = new StringBuilder();
        System.out.println(s);
        s.append("abcpnjshfjdshfbd");
        System.out.println(s);
        System.out.println(s.capacity());
        s.append("s");
        System.out.println(s.capacity());

        StringBuilder sb = new StringBuilder("JAVA");
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(2));
        System.out.println(sb.length());
        System.out.println(sb.indexOf(""+'j'));

        // To modify the existing StringBuilder
        StringBuilder sb1 = new StringBuilder("letslearnjava");
        sb1.setCharAt(0,'p');
        System.out.println(sb1);
        System.out.println(sb1.deleteCharAt(0));
        System.out.println(sb1.delete(0,4));
        System.out.println(sb1); //last index is excluded
        System.out.println();

        // Replace and repeat methods in string...
        // Replace : Replace the char sequence in string from starting to n-1 index.
        sb1.replace(0 , 4 , "Geeks"); //last index is excluded.
        System.out.println(sb1);
        StringBuilder sb2  = new StringBuilder();
        //Repeat : appends and repeat the char sequence with count .
        sb2.repeat("Hello" , 4);
        System.out.println(sb2);

    }
}
