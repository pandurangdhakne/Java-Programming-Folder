/*

   input:  AAAABBCCCAAKGF
   output: A4B2C3A2KGF


 */

import java.util.*;
import java.util.Map.Entry;
public class NvidiaQ1 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        String str = sc.nextLine();   System.out.println();
        str = str.toLowerCase();

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0 ; i<str.length() ; i++)
        {

            if(map.get(str.charAt(i)) != null)
            {
                map.put(str.charAt(i) , map.get(str.charAt(i))+1);
            }
            else
            {
                map.put(str.charAt(i),1);
            }

        }

        // System.out.println(map); 

        StringBuilder sb  = new StringBuilder();

        for(Entry<Character , Integer> entry : map.entrySet())
        {

            sb.append(entry.getKey());
            sb.append(entry.getValue());

        }

        System.out.println(sb.toString());


    }

}
