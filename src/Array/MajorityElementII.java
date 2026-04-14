package Array;

import java.util.Collections;
import java.util.Vector;

public class MajorityElementII {
    public static  Vector<Integer> majorityElementII(Vector<Integer> v){
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for (int i = 0; i < v.size(); i++) {
            if (cnt1 == 0  && ele2 != v.get(i)){
                cnt1 = 1;
                ele1 = v.get(i);
            } else if (cnt2 == 0 && ele1 != v.get(i)) {
                cnt2 = 1;
                ele2 = v.get(i);
            } else if (v.get(i) == ele1) cnt1++;
            else if (v.get(i) == ele2) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }

        Vector<Integer> ls = new Vector<>();
        cnt1 = 0 ; cnt2 = 0;
        for (int i = 0; i < v.size(); i++) {
            if (ele1 == v.get(i))cnt1++;
            if (ele2 == v.get(i))cnt2++;
        }
        int mini = (int)(v.size()/3) + 1;
        if (cnt1 >= mini) ls.add(ele1);
        if (cnt2 >= mini)ls.add(ele2);
        Collections.sort(ls);
        return ls;
    }

    public static Vector<Integer> majorityElement(Vector<Integer> v){
        int cnt1 = 0, cnt2 = 0;
        int ele1 = 0, ele2 = 0;

        for (int i = 0; i < v.size(); i++) {
            int num = v.get(i);

            if (num == ele1) cnt1++;
            else if (num == ele2) cnt2++;
            else if (cnt1 == 0) {
                ele1 = num;
                cnt1 = 1;
            }
            else if (cnt2 == 0) {
                ele2 = num;
                cnt2 = 1;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }

        // Verification
        cnt1 = 0; cnt2 = 0;
        for (int num : v) {
            if (num == ele1) cnt1++;
            else if (num == ele2) cnt2++;
        }

        Vector<Integer> ls = new Vector<>();
        int mini = (v.size() / 3) + 1;

        if (cnt1 >= mini) ls.add(ele1);
        if (ele2 != ele1 && cnt2 >= mini) ls.add(ele2);

        Collections.sort(ls);
        return ls;
    }


    public static void main(String[] args) {

    }
}
