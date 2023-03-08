import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {
    
    public static void main(String[] args) {
        

       List al = new ArrayList();

       al.add(10);
       al.add(20);

       Iterator i = al.iterator();

       while (i.hasNext()) {
        
        System.out.println(i.next());

       }

    }

}
