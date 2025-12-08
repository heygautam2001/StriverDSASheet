package Recurssion;

import java.util.Stack;

public class ReverseStack {

    public static void insertAtBottom(Stack<Integer> st , int val){
        if (st.isEmpty()){
            st.push(val);
            return;
        }
        // remove the top element and store it in a variable;
        int top = st.pop();
        // Recurss the function;
        insertAtBottom(st,val);
        // pushed the popped element back;
        st.push(top);
    }

    public static void ReverseStack(Stack<Integer> st){

        if(st.isEmpty())
            return;

        int top = st.pop();
        ReverseStack(st);
        insertAtBottom(st,top);

    }
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        ReverseStack(st);
        System.out.println(st);
    }
}
