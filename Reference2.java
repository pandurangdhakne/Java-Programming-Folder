class A
{
    int a=5;
    int b=10;

    void show(B t1 )
    {
         System.out.print(" c = "+ t1.c );
    }
}
class B extends A
{
    int c=40;
    int d=50;
}




public class Reference2 {
    
    public static void main(String[] args) {
        
      A n = new A();
      B t = new B();
     
      t.show(t);
      

    }

}
