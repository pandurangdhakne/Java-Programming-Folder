
// 1st type
/*

public class FunctionCalling {
    
    public static void run1()
    {
        System.out.print("run1 function");
    }

    public static void run2()
    {
        System.out.println("run2 function");
        run1();
    }

    public static void main(String[] args) {
       
        run2();

    }


}


*/


// 2nd type

/*

class A {

    public void run1()
    {
        System.out.println("run1 function");
    }

}

class B extends A{

    public void run2()
    {
        System.out.println("run2 function");
        run1(); // function calling
    }
}

public class FunctionCalling {

    public static void main(String[] args) {
        
          B b1 = new B();

          b1.run2();

    }


}

*/


// 3rd type

class A {

    public void run1()
    {
        System.out.println("run1 function");
    }

}


public class FunctionCalling extends A{


            public void run2()
            {
                System.out.println("run2 function");
                run1(); // function calling
            }


    public static void main(String[] args) {
        
        FunctionCalling b1 = new FunctionCalling();

          b1.run2();

    }


}
























