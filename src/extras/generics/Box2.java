package extras.generics;

public class Box2 <T extends Number> {
    /*
    Note : we can also limit the generic to a specific datatype/class/object
     */

    private T value;

    public T getValue(){
        return this.value;
    }

    public void setValue(T value){
        this.value = value;
    }


}
