package extras.generics;

public class Main1 {
    public static void main(String[] args) {
//        Box b1 = new Box();
//        System.out.println(b1.getValue());
//        b1.setValue("true");
//        System.out.println(b1.getValue());

        Box<Integer> b1 = new Box<>();
        b1.setValue(1);
//      b1.setValue("hello"); // Not allowed because generics provides type safety here.
        System.out.println(b1.getValue());

    }
}
