package GeeksForGeeks;

public class SimpleInterest {
    public static double calculateSI(double principleAmount , double rate , double time ){
        double SI;
        SI = (principleAmount*rate*time)/100;
        return SI;
    }
    public static void main(String[] args) {
        System.out.println(calculateSI(25000 , 2.5 , 4));
    }
}
