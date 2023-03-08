/* 

when you define some method in class with use of static keyword with that method
then call that method in main method like     "class_name.static_method_name"

*/

class A{
    

      public static void show()
      {
          System.out.println("hi hello");
      }


}

public class StaticMethodExample1 {
 
    public static void main(String[] args) {
        
        /*

        A a1 = new A();
        a1.show();      // hi hello

        */
       A.show();  // hi hello
 
    }

}
