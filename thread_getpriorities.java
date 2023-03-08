
class one extends Thread{

    public void run()
    {
        int i=0;
        while(i<10){
            System.out.println("pandurang");
        }
    }

}


class two extends Thread{

    public void run()
    {
        int i=0;
        while(i<10){
            System.out.println("kiran");
        }
    }

}







public class thread_getpriorities {

    public static void main(String[] args) {
        
       one t1 = new one();
       two t2 = new two();

       t1.setPriority(9);
       t2.setPriority(6);

       System.out.println("\n\n");

       System.out.println(t1.getPriority());
       System.out.println(t2.getPriority());


       
    }

}
