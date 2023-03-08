class A{

static String name;
int id;

    


static{

    name = "**** mrunal ****";
    
    System.out.println(name);

}



// anynomous block
{
    id = 100;

    System.out.println(name + " " + id);
}



// constructor
public A()
{
    System.out.println("constructor");
}

public void method()
{
    System.out.println("method");
    
}


}



public class StaticBlock_AnynomousBlock_Constructor_Method {


    public static void main(String[] args) {
        
      A a1 = new A();
      a1.method();

    }

}
