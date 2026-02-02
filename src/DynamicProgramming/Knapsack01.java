package DynamicProgramming;

public class Knapsack01 {


    public static void main(String[] args) {
        int []val = {5,3,9,16};
        int []weight = {1,2,8,10};
        int C = 8;
        System.out.println(profit(0,val,weight,C));

    }

    private static int profit(int i, int[] val, int[] weight, int C) {

        if (i == weight.length){
            return 0;
        }

        int skip =  profit(i+1,val,weight,C);
        if (weight[i] > C) return skip;
        int pick = val[i] + profit(i+1,val,weight,C-weight[i]);
        return Math.max(skip,pick);
    }
}
