package extras.javafeatures;

public class MyClass implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello");
        }
    }
}

class MyClassDriver{
    public static void main(String[] args) {
//        MyClass m1 = new MyClass();
//        Thread t1 = new Thread(m1);
//        t1.start();
//        for (int i = 0; i < 5 ; i++) {
//            System.out.println("Gautam");
//
//        }

        // Now user lambda Expression
        Runnable runnable = ()->{
            for (int i = 1; i <= 10 ; i++) {
                System.out.println(i+" hello");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }
}
