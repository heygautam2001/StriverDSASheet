package StringsInJava;

public class StringBuffers {
    public static void main(String[] args) {
        String s = "Apple";
        // to convert string into StringBuffer
        StringBuffer str = new StringBuffer(s);
        System.out.println(str.capacity());
        System.out.println(str);
        StringBuffer s2 = str.insert(1,"banana");
        System.out.println(str.hashCode());
        System.out.println(str.hashCode());// Same hashcode which reflects its mutability.

        System.out.println(s2.capacity());
        System.out.println(s2);
        s2.delete(s2.indexOf(Character.toString('b')), s2.lastIndexOf(Character.toString('a'))+1);

        // toConvert StringBUffer into string
        String s3 = s2.toString();
        System.out.println(s3);

        System.out.println();



    }
}
