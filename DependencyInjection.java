// giving reference to each class constructor 

class A
{

    int a=10;
    public A()
    {
        System.out.println("class A "+ a);
    }
    void methodA()
    {
        System.out.println("method A class");
    }

}

class B
{

    int b=20;
    public B(A obja)
    {
        System.out.println("class B: "+ obja.a);
    }

    void methodB()
    {
        System.out.println("method B class");
    }

}

class C
{

    public C(B objb)
    {
        System.out.println("class C: "+ objb.b);
    }

    void methodC()
    {
        System.out.println("method C class");
    }

}



public class DependencyInjection {
    
    public static void main(String[] args) {
        
        A a1 = new A();  
        B b1 = new B(a1);  
        C c1 = new C(b1);
  
        a1.methodA();
        b1.methodB();
        c1.methodC();

    }


}
