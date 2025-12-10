package Basics;
//leet-code 2485 done
public class FindPivotElement {
    public static int pivotInteger(int n) {
        if(n == 1)
            return 1;
        for(int i = 1; i <= n; i++){

            // calculate the sum from 1 to i;
            int leftSum = i*(i+1)/2;

            // calculate the sum from ith index to nth term.
            int rightSum = (n * (n+1)/2) - leftSum + i;
            if(leftSum == rightSum)
                return i;
        }

        return -1;
    }

    // second approach
    public static int pivotInteger1(int n) {
        if(n==1) return 1;
        int sum = n*(n+1)/2;
        int root = (int)Math.sqrt((double)sum);
        if(root*root==sum)
            return root;
        else
            return -1;
    }


    public static void main(String[] args) {
        System.out.println("Pivot element : "+pivotInteger1(8));
    }
}
