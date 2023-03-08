import java.util.*;

public class StackC {
    
    Stack ref;

    public static class Stack{

        public Integer push(Integer data)
        {
            Integer s=20;
            s = s + data;
            return s;
        }

    }

    public static void main(String[] args) {
        
    Stack st = new Stack();
    /*

    StackC s = new StackC();
    s.ref = new Stack();
   System.out.println( s.ref.push(10));
   
   */ 
    Integer t = st.push(10); // Integer
    System.out.println(t);



    }

}
