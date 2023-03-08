import java.util.*;

public class ArrayConvertToAnyCollectionClass {
    
    public static void main(String[] args) {
        
// Java program to demonstrate error
// if we add more element(s) to
// a fixed-size List.

 /* 
 
        String[] geeks = {"Rahul", "Utkarsh",
                          "Shubham", "Neelam"};
 
        // Conversion of array to ArrayList
        // using Arrays.asList
        List al = Arrays.asList(geeks);
        System.out.println(al);
 
        // Adding some more values to the List.
        // al.add("Shashank");
        // al.add("Nishant");
 
        // System.out.println(al);
  */  
//2 nd code following

String[] geeks = {"Rahul", "Utkarsh",
"Shubham", "Neelam"};

List<String> al =
new ArrayList<String>(Arrays.asList(geeks));
System.out.println(al);

// Adding some more values to the List.
al.add("Shashank");
al.add("Nishant");

System.out.println("\nArrayList After adding two" +
 " more Geeks: ");
System.out.println(al);

    }

}
