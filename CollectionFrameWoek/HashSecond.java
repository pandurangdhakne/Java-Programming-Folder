import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashSecond {
    
    public static void main(String[] args) {
        
        // 3 3 3 4 4 2 2 1

        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        
        map.put(3 , 3);
        map.put(4 , 2);
        map.put(2 , 2);
        map.put(1,1);
        

        // int [] arr = {9,32,32,1,1,1,4,4,4,4,4,5,5,5,6,6,6,9,9,9};

        
       Iterator it =  map.entrySet().iterator();

       int min = Integer.MAX_VALUE;
       int key = 0;
       while (it.hasNext()) {
        
        //   System.out.println(it.next()); 

        Map.Entry kv = (Map.Entry) it.next();

                   int k = (int) kv.getKey();
                   int v = (int) kv.getValue();


                   if(v < min)
                   {

                         min = v;
                         key = k;

                   }



 
       }

       System.out.println(key + " : " + min);


    }

}
