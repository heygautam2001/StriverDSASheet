package Array;
// Leet-code 744
public class FindSmallestLetterGreaterThanTarget {
    // Linear search solution...
    public static char nextGreatestLetters(char[] letters, char target) {

        for(char ch : letters){
            if(ch > target)
                return ch;
        }

        return letters[0];

    }


    // Optimal solution // Binary Search
    public static char nextGreatestLetter(char[] letters, char target) {
        int lo = 0;
        int hi = letters.length - 1;
        char ans = letters[0];
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(letters[mid] > target){
                ans = letters[mid];
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
