package extras.javafeatures;

@FunctionalInterface
public interface Parent {
    public void sayName();
}

@FunctionalInterface
interface Child extends Parent {
    //    public void sayHello();
    public void sayName();

    default void sayBye() {
        System.out.println("BYE BYE GAUTAM");
    }

    static void sayGoodBye(){
        System.out.println("Good Bye Gautam !");
    }

    public static void main(String[] args) {
        Child child = ()->{
            System.out.println("Hello I am gautam");
        };
        child.sayName();
        Child.sayGoodBye();// Static method cannot be inherited and overrided.
    }



}
