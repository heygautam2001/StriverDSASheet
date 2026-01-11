package CollectionsInJava.Map;

import java.lang.ref.WeakReference;

class Phone{
    String brand;
    String model;

   public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
public class GC {
    public static void main(String[] args) throws InterruptedException {
//        Phone phone = new Phone("Apple","16 pro max");
//        System.out.println(phone);
//        phone = null;
//        System.gc();
//        System.out.println(phone);

        Phone phone = new Phone("Apple","16 pro max");
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(phone);
        System.out.println(phoneWeakReference.get());
        System.gc();
        Thread.sleep(20000);
        System.out.println(phoneWeakReference.get());



    }
}
