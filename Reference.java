
class A{

    void run()
    {
        System.out.println("parent class run method");
    }

    void base()
    {
        System.out.println("parent class base method");
    }
}
class B extends A{

    @Override
    void run()
    {
        System.out.println("child class run method");
    }
    void derive()
    {
        System.err.println("child class derive method");
    }

}


public class Reference {

    public static void main(String[] args) {
        
        A a1 = new B();
        a1.run(); // CHILD METHOD RUN
        a1.base(); // PARENT METHOD BASE
        // a1.derive();

        B b1 = new B();
        b1.run(); // CHIILD METHOD RUN

    }
    
}
