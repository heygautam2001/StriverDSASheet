package GeeksForGeeks;

public class AddComplexNumber {
    public static class ComplexNum
    {
        int real , imaginary;
        ComplexNum(int real , int imaginary){
            this.real = real;
            this.imaginary = imaginary;
        }

        public void show(){
            System.out.println(this.real + " i"+this.imaginary);
        }

        public static ComplexNum add(ComplexNum n1 , ComplexNum n2){
            ComplexNum result = new ComplexNum(0,0);
            result.real = n1.real + n2.real;
            result.imaginary = n1.imaginary + n2.imaginary;

            return result;
    }
    }

    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(4,4);
        ComplexNum c2 = new ComplexNum(3,4);

        ComplexNum.add(c1,c2);




    }
}
