package extras.multiThreading;

public class A {
    public static void main(String[] args) {
        B b = new B();
        Thread t1 = new Thread(b);
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
    }
}
