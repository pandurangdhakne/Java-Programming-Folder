interface A{
    public void method1();
}

interface B{
    public void method2();
}

interface C{
    public void method3();
}

class D implements A,B,C{

    public void method1()
    {
        System.out.println("method1");
    }

    public void method2()
    {
        System.out.println("method2");
    }

    public void method3()
    {
        System.out.println("method3");
    }


}





public class InterfaceConceptMultipleInterfaceOneClass {
 
    public static void main(String[] args) {
        
        
       D d1 =  new D();
       d1.method1();
       d1.method2();
       d1.method3();


    }


}
