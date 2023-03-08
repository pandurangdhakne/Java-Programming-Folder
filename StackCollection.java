import java.util.Stack;

import java.util.*;

public class StackCollection {
    
    public static void main(String[] args) {
        
        Stack<Integer> st=new Stack<Integer>();
        st.push(100);
        st.push(200);
        st.push(300);

        System.out.print(st);
        System.out.println();
        System.out.print(st.pop());
        System.out.println();
        System.out.print(st.peek());
        System.out.println();
        System.out.print(st.empty());
        System.out.println();
        System.out.println( st.capacity());

    }

}
