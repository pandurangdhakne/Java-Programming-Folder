
class A{


    int id ; String name; String city;

    public A()
    {
        System.out.println("Without Parametrize constructor");
    }
    public A(int id , String name)
    {
        this.id = id;
        this.name = name;
    }
    public A(int id , String name , String city)
    {
        this.id = id;     
        this.name = name; 
        this.city = city;

    }
   

    public void display()
    {
        System.out.println("id: "+id + " name: "+ name + " city: "+ city);
    }

}

public class thisKeywordUse {
    

    public static void main(String[] args) {
        
        A a = new A();    //Without Parametrize constructor
        
        System.out.println();
       
        A a1 = new A(2000,"rebel");
        a1.display();
        
        System.out.println();
        
        A a2 = new A(2000,"rebel","pune");
        a2.display();

    }
     

}
