interface A{
    public void method1();
}

class B implements A{
    
   public void method1(){
       System.out.println("class B method1");
   }

}

class C implements A{
    
    public void method1(){
        System.out.println("class C method1");
    }
 
 }

 class D implements A{
    
    public void method1()
    {
        System.out.println("class D method1");
    }
 
 }


public class InterfaceConceptOneInterfaceMultipleClass {
    
    public static void main(String[] args) {
        

        B b = new B();
        C c = new C();
        D d = new D();

        b.method1();
        c.method1();
        d.method1();


    }


}
