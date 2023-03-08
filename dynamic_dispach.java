import java.util.Scanner;

// final,private,static it is not allowed in overriding methods


class base{
    @Override
    public void name(){
        System.out.println("my name is [base class] ");
    }

    public void play(){
        System.out.println("cricket");
    }
}

class derive extends base{
    @Override
    public void name(){
        System.out.println("my name is [derive class] ");
    }

    public void hobby(){
        System.out.println("coading");
    }
}






// main function
public class dynamic_dispach {
    
   public static void main(String[] args) {
       
    //    base obj = new base();   obj.name(); obj.play();        // it is allowed
       
    //    derive obj1 = new derive();  obj1.name(); obj1.hobby();    // it is allowed


         base obj3 = new derive();  // systax of dynamic dispach
         obj3.name();   // only show the derive class overriding function not a base class got it
          
         
         obj3.play();  // base class function show except overriding base class function
        
        //  obj3.hobby(); // in derived class only access the overriding function in derive class not access the other function



   }

}
