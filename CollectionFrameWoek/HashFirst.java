
import java.security.KeyStore.Entry;
import java.util.*;

class HashFirst{
    public static void main(String[] args) {
        

    HashMap<String,Integer>map = new HashMap<String,Integer>();

    map.put("omkar", 2000);
    map.put("pandurang", 3000);
    

    System.out.println(map);

    System.out.println("\n\n");

    System.out.println(map.get("omkar"));

    System.out.println("\n\n");

    for (String string : map.keySet()) {
     
        System.out.println(string);
        
    }


    System.out.println("\n\n");

    for (Integer i : map.values()) {
     
        System.out.println(i);
    }

    System.out.println("\n\n");

    for (String i : map.keySet()) {
        
        System.out.println("key :" + i + "     "+ "value : " + map.get(i));
    }
    

    System.out.println("\n\n");

    System.out.println(map.isEmpty());



    System.out.println("****************************");
    Iterator it = map.entrySet().iterator();

    while(it.hasNext()){
        Map.Entry kv = (Map.Entry) it.next();
        String k = (String) kv.getKey();
        int v = (int) kv.getValue();
        System.out.println(k+" "+v);
    }


    }



}