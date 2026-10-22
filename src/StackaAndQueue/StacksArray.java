package StackaAndQueue;

public class StacksArray {
    int top = -1;
    int[] st = new int[10];

    public void push(int data) throws Exception {
        if (top >= st.length) {
            throw new Exception("maximum capacity reached");
        }
        st[++top] = data;
    }

    public int peek()throws Exception{
        if (top == -1){
            throw new Exception("stack is empty");
        }
        return st[top];
    }

    public int pop() throws Exception{
        if (top == -1){
            throw new Exception("stack is empty");
        }
        int removed = st[top];
        top = top -1;
        return removed;
    }
    public int size()throws Exception{
        if (top == -1){
            throw new Exception("stack is empty");
        }
        return top+1;
    }

    public void printStack(){
        for(int i = 0; i <= top; i++){
            System.out.print(st[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)throws Exception {
        StacksArray st = new StacksArray();
        st.push(10);
        st.push(20);
        st.push(30);
        st.printStack();
    }

}