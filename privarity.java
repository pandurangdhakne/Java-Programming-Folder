class A extends Thread
{

    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

    }

}


public class privarity {
   
   
    
    public static void main(String[] args) {
        
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

       t1.setName("pandurang");
       t2.setName("omkar");
       t3.setName("rebel");

       t1.setPriority(2);
       t2.setPriority(9);
       t3.setPriority(7);

       t1.start();
       t2.start();
       t3.start();



    }


}
