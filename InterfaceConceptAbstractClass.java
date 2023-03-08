interface A{

    public void method1();

}

abstract class B implements A{

     abstract public void method1();

}

class C extends B{

    public void method1()
    {
        System.out.println("method1 guys");
    }
}


public class InterfaceConceptAbstractClass {

    public static void main(String[] args) {
        
        C c1 = new C();
        c1.method1();

    }

}
