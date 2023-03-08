import java.util.HashMap;

import jdk.incubator.foreign.Addressable;




public class java_Hashmap {

    public static void main(String[] args) {
   
        HashMap<String,String> address = new HashMap<String,String>();
        
        address.put("Aurangabad", "pisadevi");
        address.put("Pune", "kalewadi");
        address.put("Latur", "golay");
        address.put("Beed", "subhashroad");
        
        System.out.println(address);

     
    System.out.println("\n\n");      
        // Access an item get()
        System.out.println(address.get("Pune"));



    System.out.println("\n\n");   
        // Remove an item remove()
        address.remove("Aurangabad");
        System.out.println(address);

        
    System.out.println("\n\n");       
        // size an item size()
        System.out.println(address.size());

        
        
    System.out.println("\n\n");       
        // loop through a hashmap key
        for (String i : address.keySet()) {
            System.out.println("key = "+ i);
        }


    System.out.println("\n\n");      
          // loop through a hashmap value
        for (String i : address.keySet()) {
            System.out.println("values = "+ address.get(i) );
        }


    System.out.println("\n\n");
        // loop through a hashmap key & value
        for (String i : address.keySet()) {
            System.out.println("key ="+ i + " values = "+ address.get(i));
        }




    }

}
