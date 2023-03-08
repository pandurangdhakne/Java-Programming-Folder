class A{
    int a=5;
    int b=10;
}
class B extends A{
    int a=10;
    int b=20;
}



public class ReferenceConcept {

    static void show(B a1)
    {
        System.out.println("a = "+ a1.a);
        System.out.println("b = "+ a1.b);
    }
   
    public static void main(String[] args) {
        
        B b1 = new B();
        A t1 = new B();

        System.out.println(t1.a);
        System.out.println(t1.b);

        
        show(b1);
      

    }


}
