
class one extends Thread{

    public void run()
    {
        int i=0;
        while(i<10){
            System.out.println("pandurang");
            i++;
        }
    }

}


class two extends Thread{

    public void run()
    {
        int i=0;
        // while(i<10){
        //     System.out.println("kiran");
        //     i++;
        // }
    }

}







public class thread_getstate {

    public static void main(String[] args) {
        
       one t1 = new one();
       two t2 = new two();


    //    t1.start();
    //    t2.start();


       t1.setPriority(9);
       t2.setPriority(6);

    //    System.out.println("\n\n");

       System.out.println(t1.getPriority());    // 9
       System.out.println(t2.getPriority());    // 6

      
       
       System.out.println(t1.getState());   // NEW  // with while loop
       System.out.println(t2.getState());   // NEW   // with while loop



       t2.start();
       System.out.println(t2.getState()); // RUNNABLE // without while loop

       


       
    }

}
