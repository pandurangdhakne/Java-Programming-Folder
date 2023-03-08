/*

static varible ko kabhibhi "class_name.static_varible_name"  form mai write kiya kare

*/

class A{

    public static int count = 0;
    
    public A()
    {
             count++;
    }
}

public class NumberOfObjectCount {
    
    public static void main(String[] args) {
        
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();
        A a6 = new A();

        System.out.println("Number of class A object: "+ A.count);


    }

}
