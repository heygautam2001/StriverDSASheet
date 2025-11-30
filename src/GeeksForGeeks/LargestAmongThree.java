package GeeksForGeeks;

public class LargestAmongThree {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 100;
        int num3 = 12;

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 +" is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 +" is greater");
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else{
            System.out.println(num3+" is greater");
        }

        int greater = num1 > num2 && num1 > num3 ? num1 : num2 > num1 && num2 > num3 ? num2 : num3;
        System.out.println(greater);
    }
}
