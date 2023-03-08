
interface A{

    public void show();
}

public class DynamicClassAnynomosClass {
   
   
     public static void main(String[] args) {
        
      A a = new A()
      {

        public void show() {
            
            System.out.println("hi guys");

        }

      };

      a.show();

     }
     
}
