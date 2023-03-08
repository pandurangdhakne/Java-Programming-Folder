import java.util.LinkedList;



public class linkedList_fun { 
  public static void main(String[] args) { 
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);


System.out.println("\n\n");

   // use addFirst()
   cars.addFirst("thor");
   System.out.println(cars);

System.out.println("\n\n");   

   // use addLast()
   cars.addLast("15");
   System.out.println(cars);  

System.out.println("\n\n");   

   // use removeFirst()
   cars.removeFirst();
   System.out.println(cars); 


System.out.println("\n\n");   

   // use removeLast()
   cars.removeLast();
   System.out.println(cars); 

 
System.out.println("\n\n");      

   // use getFirst() display the first item in the list
   System.out.println(cars.getFirst());


System.out.println("\n\n");      

   // use getLast() display the last item in the list
   System.out.println(cars.getLast());   
0




   


  } 
}
