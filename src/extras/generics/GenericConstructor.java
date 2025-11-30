package extras.generics;
class  Box3{
    public <T> Box3(T type){
        // Generic constructor
    }

    public <T extends Integer> Box3(T type){

    }

}

public class GenericConstructor {
    public static void main(String[] args) {
      Box3 b1 = new Box3("Hello");
        System.out.println();
    }
}
