import java.util.Scanner;

import jdk.dynalink.beans.StaticClass;

class base{

    /*
     modifires:-  public,private,protected,default
     
    */

/*
     static int a=12;
     static int b=23;
*/

  /*
   public static void value() {

        System.out.println(a);
        System.out.println(b);
    }
    */


    public int a=12;
    public int b=23;

    
    public void value() {

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    

  


}

class second{

    public int c,d;

        public void val(int c, int d){
            
            System.out.println("c="+c + " "+ "d=" +d);

        }


}




public class class_attributes {

    public static void main(String[] args) {
        
        base b1 = new base();
        b1.value();

        second b2 = new second();
        b2.val(2,3);

    }
    
}
