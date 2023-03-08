

// *********** private access specifire ************

/*

public class Specifire {
    
    private void show()
    {
        System.out.println("private");
    }

    public static void main(String[] args) {
    
        Specifire t1 = new Specifire();
         t1.show();

  }


}

*/


class A{

    protected void show1()
    {
        System.out.println("Protected in base class");
    }

}

class B extends A{

    protected void show3()
    {
        System.out.println("Protected in derived class");
    }

}



public class Specifire {
    

    protected void show2()
    {
        System.out.println("Protected in main class");
    }

    public static void main(String[] args) {
    
       A t1 = new A();
       t1.show1(); 

       Specifire t2 = new Specifire();
       t2.show2();

       B t3 = new B();
       t3.show3();
       

  }


}
















