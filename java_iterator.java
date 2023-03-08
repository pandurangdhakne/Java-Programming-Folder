import java.util.ArrayList;
import java.util.Iterator;

//  hasNext() with iterator object , next() with iterator object



public class java_iterator {

    public static void main(String[] args) {
        
        // make a collection
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(15);
        number.add(25);
        number.add(13);
        number.add(54);
        
    System.out.println(number);

        // get the iterator
        Iterator<Integer> it = number.iterator();
        // System.out.println(it.next());     // output = 15
        // System.out.println(it.next());     // output = 25
        // System.out.println(it.next());     // output = 13
        // System.out.println(it.next());     // output = 54


        // other type without iterator
        /*
        for (Integer p : number) {
            System.out.println("forEach loop through without iterator = "+p);
        }
        */



        // another type through iterator
        while(it.hasNext()){
            System.out.println("with while loop with hasNext() use = "+ it.next());
        }



        // remove()
        /*
        while(it.hasNext()){
            Integer i = it.next();
            if(i<15){
                it.remove();
            }
        }
        System.out.println(number);     // output = [15,25,54]

        */


  
    }

}
