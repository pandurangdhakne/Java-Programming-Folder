
class A {

    int x,y,z;
    // public int A()
    // {
    //    return 10;
    // }

    public static void some()
    {
        System.out.println("hello");
    }

    public A(int n)
    {
         this.x = n;
    }

    public A(int n, int m, int f)
    {
        this(n);

        this.y = m;
        this.z = f;
    }
    
}

public class Contructor_Concept {
    
    public static void main(String[] args) {
        
        //   A a1 = new A();

        //   System.out.println(a1);  // A@36baf30c

          A.some();   // static

        //   A a2 = new A(200); 
          A a2 = new A(200,300,400);

          System.out.println(a2.x + " " + a2.y + " " + a2.z);

    }

}
