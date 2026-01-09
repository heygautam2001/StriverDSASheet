public class overriding {
    public void sayName(){
        System.out.println("Say may name");
    }
}


 class overriding2 extends overriding{
     @Override
     public void sayName() {
         System.out.println("Hello I am Gautam");
     }

     public static void main(String[] args) {
         overriding o1 = new overriding2();
         o1.sayName();
     }

 }