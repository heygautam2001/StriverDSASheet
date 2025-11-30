package Recurssion;

public class PrintNToOne {
    public static void printNToOne(int n){
        if(n < 1)
            return;
        System.out.println(n);
        printNToOne(n-1);
    }
    public static void main(String[] args) {
        printNToOne(5);
    }
}
