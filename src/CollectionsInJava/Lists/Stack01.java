package CollectionsInJava.Lists;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        // Works in Last In First Out(LIFO);
        // Works in FILO also
        // Example : stack of books, stacks of plate etc...
        // it extends vector so that it is thread safe.

        Stack<Integer>st = new Stack<>();
        //add
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);

        // find top element...
        System.out.println(st.peek());

        // find the size.
        System.out.println(st.size());

        // check the stack emptiness
        System.out.println(st.isEmpty());

        //removing element from stack
        st.pop();
        System.out.println(st);

        // You can also use vector methods and list interface method in stack.
        // Not only this you can also implement stack by using LinkedList class.

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(12); // push
        linkedList.addLast(13);
        linkedList.addLast(12);
        linkedList.addLast(11);
        linkedList.addLast(17);
        linkedList.addLast(19);

        linkedList.size();
        linkedList.getLast(); // peek

        linkedList.removeLast(); //pop

    }
}
