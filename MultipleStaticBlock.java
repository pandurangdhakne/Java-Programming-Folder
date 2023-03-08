public class MultipleStaticBlock {
    
    static{
        System.out.println("hi");
    }
    
    {
        System.out.println("hi everyone");
    }

    static{
        System.out.println("hello");
    }

    {
        System.out.println("hi everyone how are you guys");
    }

         public static void main(String[] args) {
             

            MultipleStaticBlock a = new MultipleStaticBlock(); // need for anynomous block run

         }
      

}
