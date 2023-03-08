
class A{

      static int a = 10;
      static String name = "pandurang";

}


public class StaticDataMemberExample1 {
    
     static int id = 2000;

    
    public static void main(String[] args) {
       /*  
     A a1 = new A();
     System.out.println(a1.a);
       */

      System.out.println(A.a + "   " + A.name);

      System.out.println();

      System.out.println(id);

      

    }

}
