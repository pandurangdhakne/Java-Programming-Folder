interface A{
    public void set();
}

interface B extends A{
    public void get();
}
class C implements B 
{

     public void set()
     {
         System.out.println("set");
     }

     public void get()
     {
         System.out.println("get");
     }

    

}




public class InterfaceConceptInterfaceInheriteWithInterface {
    

    public static void main(String[] args) {
        
        C c1 = new C();
        c1.set();
        c1.get();

    }

}
