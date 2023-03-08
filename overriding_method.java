import java.util.Scanner;

// final,private,static it is not allowed in overriding methods


class base{

    public void name(){
        System.out.println("my name is [base class] ");
    }

    public void play(){
        System.out.println("cricket");
    }
}

class derive extends base{

    public void name(){
        System.out.println("my name is [derive class] ");
    }

    public void hobby(){
        System.out.println("coading");
    }
}






// main function
public class overriding_method {
    
   public static void main(String[] args) {
       
    //    base obj = new base();   obj.name(); obj.play();        // it is allowed
       
    //    derive obj1 = new derive();  obj1.name(); obj1.hobby();    // it is allowed


    derive obj2 = new derive();   obj2.name();   // overriding

    base obj3 = new base();   obj3.name();       // overriding



   }

}
