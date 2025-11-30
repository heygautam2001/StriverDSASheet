package extras.generics;

public class Main2 {
    public static void main(String[] args) {
        Box2 <Integer> b1 = new Box2<>();
        Box2 <Double> b2 = new Box2<>();
        Box2 <Float> b3 = new Box2<>();
        Box2 <Long> b4 = new Box2<>();
        Box2 <Short> b5 = new Box2<>();
        Box2 <Byte> b6 = new Box2<>();

       // Box2 <String> b7 = new Box2<String>(); // Not possible
        // we limit the Generics to a specific class.
        /*
        Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
        */


    }
}
