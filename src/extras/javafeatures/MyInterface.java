package extras.javafeatures;
@FunctionalInterface
public interface MyInterface {

    public void sayName();

//    public String sayBye();  // Functional Interface only contains single abstract method.
    // but it can contain any number of default and static method;

    // adding a static method

    public static void sayHello(){
        System.out.println("Hello User !");
    }
    default void printInfo(){
        System.out.println("This is a functional Interface");
    }
}

class Main{
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void sayName() {
                System.out.println("Hello  I am Gautam !");
            }
        };
        MyInterface myInterface1 = ()->{
            System.out.println("hello this is Gautam !");
        };

        myInterface1.sayName();
    }
}
