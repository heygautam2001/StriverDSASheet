package extras.generics;

public class  GenericContainer <T> implements Container <T>{

    private T item;
    @Override
    public T get() {
        return this.item;
    }

    @Override
    public void add(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        GenericContainer <Integer> item = new GenericContainer<>();
        item.add(45);
        System.out.println(item.get());
    }
}
