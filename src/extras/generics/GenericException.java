package extras.generics;
/*
1.Exception : An exception is an event that occurs during runtime/execution of
program that disrupts its normal flow of execution.
2.Exception are represented by the classes and they can be caught and handled
by using try-catch blocks.
3. java allows us to define our own exceptions by extending the exception class
or any of its subclass.

4. However,when it comes to making exception generics , things get a bit more
complicated. java does not support generic exception due to its type erasure.
Type erasure means that generic type information is removed at runtime. since
exception are tightly tied to run time operation having generic exception would not
work as expected.

Note : if you had an exception like MyGenericException<T> , you wont be able to
catch it with a specific type parameter because that type information would be
erased at runtime.

 */

// class MyException <T> extends Exception{
//     //Generic class may not extend 'java.lang.Throwable' --> error CTE
// }

class MyException extends Exception{

    public <T> MyException(T values){
        super("Exception related values : "+ values.toString()
        +" of type "+values.getClass().getName()
        );

    }
}

public class GenericException {
    public static void main(String[] args) {
       try{
           throw new MyException("caught an exception");
       }catch(MyException e){
           System.out.println("exception cauted  "+e.getMessage());
       }

       try {
           throw new MyException("String");
       }catch (MyException e ){
           e.printStackTrace();
       }

    }
}
