package StackaAndQueue;

public class QueueArray {
    int size = 10 ; int[]q = new int[size]; int currSize = 0;
    int st = -1 ,  en = -1;

    public void offer(int val){
        if (currSize == size){

        }

        if (currSize == 0){
            st = 0;
            en = 0;

        }else
        {
            en = (en+1) % size;

        }
        q[en] = val;
        currSize = currSize+1;
    }
    public int poll(){
        if (currSize == 0){

        }
        int ele = q[st];
        if (currSize == 1){
            st = en = -1;
        }else{
            st = (st + 1)%size;
        }
        currSize--;
        return ele;

    }
    public int element(){
        if (currSize == 0){

        }
        return q[st];
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {

    }
}
