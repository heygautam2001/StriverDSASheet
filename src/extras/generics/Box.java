package extras.generics;

public class Box<T> {
    private T value;

    public T getValue(){
        return this.value;
    }

    public void  setValue(T value){
        this.value = value;
    }

}
