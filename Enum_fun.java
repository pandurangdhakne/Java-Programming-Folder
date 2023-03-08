/*
 *********** Java Enum **********
 An "enum" is a special "class" that represents a group of "constants" (unchangealble variable, like "final" variable)

*/

// outside the main class
enum level{
    low, medium, high
}


public class Enum_fun {
// inside the main class
enum box{
    larger, smaller, extra_larger
}


    public static void main(String[] args) {
        
        // outside the main class
          level obj = level.medium;
          System.out.println("level medium = "+obj);

        // inside the main class
           box obj2 = box.larger;
           System.out.println("box larger = "+obj2);

           // switch case
           switch(obj){

            case low:
                System.out.println("low level");
                break;
            case medium:
                System.out.println("medium level");
                break;
            case high:
                System.out.println("high level");    
                break;        

           }

           // through an enum

           for (level p1 : level.values()) {
               System.out.println("using for-each loop for enum = "+p1);
           }


    }

}
