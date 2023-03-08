class A{

    public void method()
    {
          System.out.println("method for A class");
    }

}

class Text{

    public static void method1(A ref)
    {

        ref.method();

    }

}


public class ConceptForStaticMethodWithAnotherClass {
    
    public static void main(String[] args) {
        
        Text.method1(new A());

    }
}
