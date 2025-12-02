package extras.javafeatures;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Optionals{

//    private static String getName(int id){
//        //get data from db
//        return null;
//    }

    private static Optional<String> getName(int id){
        //get data from db
//        String name = "Ram";
        String name = null;

        return Optional.ofNullable(name);
    }


    public static void main(String[] args) {
//        String name = getName(1);
//        System.out.println(name.toUpperCase());
        // Main method does not know that the getName method ca return a null...

        // So check
//        if(name != null){
//            System.out.println(name);
//        }else{
//            System.out.println("null");
//        }

        // but if you have thousands of this type of scenario where data is return as null.
        // In that case , It will overburden to check each and every scenario.
        // so to avoid this we use optional class ...2

        Optional<String> name = getName(2);
        System.out.println(name);
        if (name.isPresent()){
            System.out.println(name.get());
        }

      name.ifPresent(x-> System.out.println(x));
       String get = name.orElse(null);
//     String nameToBeUsed = name.orElseThrow(()-> new NoSuchElementException());
//     System.out.println(nameToBeUsed);

       String getName = name.orElseGet(()->{
            return "I am value ";
        });
        System.out.println(getName);


    }
}
