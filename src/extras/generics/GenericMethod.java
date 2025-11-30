package extras.generics;

class Print{

    public static  <T> void printArray(T [] arr){
        for(T ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    }

enum Operation{

    ADD , SUBTRACT , MULTIPLY,DIVIDE;
    public <T extends Number> double apply(T a , T b){
        switch (this){
            case ADD:
                return a.doubleValue() + b.doubleValue();
            case SUBTRACT:
                return a.doubleValue() - b.doubleValue();
            case MULTIPLY:
                return a.doubleValue() * b.doubleValue();
            case DIVIDE:
                return a.doubleValue() / b.doubleValue();
            default:
                throw new AssertionError("Unknown Operation");
        }
    }

    public static  <T extends Number> void printArray(T [] arr){
        for(T ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        Number [] arr = {2,1.2,2.5,2,1.9,7};
        Double [] doubles = {2.2,1.2,2.5,2.6,1.9,7.5};
        Print.printArray(arr);
        Print.printArray(doubles);
        String [] num = {"One" , "Two" , "Three" , "Four" , "Five"};
        Print.printArray(num);

        // Generics methods in enum

        double res1 = Operation.ADD.apply(10,20);
        System.out.println(res1);

    }
}
