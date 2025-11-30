package extras.generics;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WildCard {
    /*
    1. In java Generics , wildcard(?) are special kind of type argument that can
    be used in method argument or class definitions to represent an unknown type
    They allow for more flexible and dynamic code by letting the type be specified
    later or be more loosely defined.
     */
    /*
    wildcard(?) can be used whenever you read something only , if you are returning
    something you cannot use (?) wildcard
     */
    public static void main(String[] args) {
       /*
       ArrayList <?> list = new ArrayList<String>();
       list.add("Hello");
       // Here in the same way you can ony read the things , if you try to
       // modify it will give you error , just like here it is happening.
       */
        System.out.println(Copy.sum(Arrays.asList(1,2.2,22)));
        Copy.printNumbers(Arrays.asList(1,2,3));


        List< ? super Integer> numbers = Arrays.asList(1,2,3);
        numbers.add(12);
        numbers.add(null);
        System.out.println(numbers);

    }
}

class  Copy {

    // Upperbound --- > Only lowest class you can add
    public static double sum(List<? extends Number> numbers){
        double sum = 0;
        for (Number o : numbers){
            sum += o.doubleValue();
        }
        return sum;
    }

    //LowerBound ---> Not going down towards integer.
    public static void printNumbers(List<? super Integer> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }

    public <T> T getFirst(ArrayList<T>list){
        return list.get(0);
    }

    public  void printArray(ArrayList<?> list){
        for (Object ele : list ){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

   /*

    // It is giving you error because you are not reading , you
    // are trying to alter the lists by performing operation.
    public void copy(ArrayList<?> source , ArrayList<?> destination){
        for( Object item : source){
            destination.add(item);
        }
        // Not possible with WildCard Operator.
        }


     */


}

