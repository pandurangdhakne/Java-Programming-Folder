
import java.util.*;
import java.io.*;

public class HashThird {
    
    public static void main(String[] args) {
        

        int [] arr = {9,9,32,32,1,1,1,4,4,4,4,4,5,5,5,6,6,6,9,9,9};

        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();

        

        for(int i=0 ; i<arr.length ; i++)
        {

            int count=1;
             if(!map.containsKey(arr[i]) )
             {
   
                map.put(arr[i],count);

             }
             else
             {
              
                int j = map.get(arr[i]) + 1;
                
                map.put(arr[i] , j);
                

             }

            // Anuj bhaiyaa
            // map.put(arr[i],map.getOrDefault(arr[i], 0) + 1 );


        }


        System.out.println(map);









    }

}
