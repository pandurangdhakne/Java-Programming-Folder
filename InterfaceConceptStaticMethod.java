interface A{

    int x=10;  // By default static
    public static void method1()
    {
        System.out.println("hi guys");
    }

}

public class InterfaceConceptStaticMethod {
    
    public static void main(String[] args) {
        
        A.method1();    // hi guys
        System.out.println(A.x);  // 10

    }

}
