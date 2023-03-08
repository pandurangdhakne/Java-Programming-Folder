import java.util.ArrayList;
import java.util.Collections;



public class arraylist {

    public static void main(String[] args) {
        
        ArrayList <String> name = new ArrayList<String>();
        
        // Add Item add()
        name.add("omkar");
        name.add("pandurang");
        name.add("rebel");
        name.add("king");

    System.out.println("ArrayList name= "+name);


    System.out.println("\n\n");
       // Get Item get() 
       System.out.println("name 0 = "+name.get(0));
       System.out.println("name 1 = "+name.get(1));
       System.out.println("name 2 = "+name.get(2));
       System.out.println("name 4 = "+name.get(3));

    
    System.out.println("\n\n");
    //change an item  set()
       name.set(0, "python");
       name.set(1, "java");
       System.out.println("ArrayList set name= "+name);


    System.out.println("\n\n");
    // remove an item  remove(index)
       name.remove(0);
       System.out.println("ArrayList remove name= "+name);   


    System.out.println("\n\n");   
    // arraylist size
       System.out.println("arralit size= "+name.size());

       
       
    System.out.println("\n\n");   
    // loop through an arraylist get() , size()
        for(int i=0 ; i<name.size() ; i++){
            System.out.println("loop throught arraylist name= "+name.get(i));
        }


    System.out.println("\n\n");
    // for-each methode
       for (String i : name) {
        System.out.println("forEach loop= "+ i);
       }

    System.out.println("\n\n");
    // sort an arraylist import "collection" , sort()
        Collections.sort(name);
        for (String i : name) {
            System.out.println("sort = "+ i);
        }

    System.out.println("\n\n");
    // clear()
        name.clear();
        System.out.println("clear the arraylist = "+name);    // all clear direct


    }

}
