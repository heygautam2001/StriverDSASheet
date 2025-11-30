package extras.generics;

import java.util.ArrayList;
import java.util.List;

public class ProbleumWithoutGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add('C');
        list.add(12);
        list.add(12.3f);
        list.add(11.2);
        System.out.println(list);

//       String str = list.get(0);
       //java: incompatible types: java.lang.Object cannot be converted to java.lang.String

        int str = (int)list.get(2);
        System.out.println(str);

        int x = (int)list.get(1);
        System.out.println(x);
        /*
        * Exception in thread "main" java.lang.ClassCastException:
        *  class java.lang.Character cannot be cast to class java.lang.Integer
        *  (java.lang.Character and java.lang.Integer are in module java.base of loader 'bootstrap')
	       at extras.generics.ProbleumWithoutGenerics.main(ProbleumWithoutGenerics.java:22)
        * */

        /*
        1. No type safety
        2. Manual Casting
        3. No compile time checking
        these are the problem without generics .
        these problem can be solved by generics.

         */
    }
}
