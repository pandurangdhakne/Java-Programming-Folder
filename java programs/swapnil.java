interface A{

      public void set();
      public void get(int a);

}

class B{

    public void put()
    {
        System.out.println("kkkk");
    }

    public void set()
    {
        System.out.println("lllllll");
    }
}

class C extends B implements A{

     public void get(int p)
     {
         System.out.println(p);
     }


}


public class swapnil {
    

    public static void main(String[] args) {
        
        C c1 = new C();
        c1.get(10);
        c1.put();
        c1.set();

        

    }


}
