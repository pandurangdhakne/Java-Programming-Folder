
class base{

    base()
    {
        System.out.println("Iam a constructor without parameter");
    }

    base(int a)
    {
        System.out.println("a="+a);
    }

}




public class constuctor_type {

    public static void main(String[] args) {
        
      base b1 = new base();
      base b2 = new base(12);



    }

}
 