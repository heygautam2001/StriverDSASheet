package Array;
// leet-code 3687
public class LibraryLateFees {
    public static int lateFees(int[] overdue , int[] dailyLateFee){
        int n = overdue.length;
        int totalLateFees = 0;
        for (int i = 0; i < n; i++) {
            totalLateFees += overdue[i]*dailyLateFee[i];
        }
     return totalLateFees;
    }

    public static void main(String[] args) {
        int[] d = {2, 3, 1};
        int[] g = {5, 4, 10};

        int result = lateFees(d, g);

        System.out.println(result);

    }
}
