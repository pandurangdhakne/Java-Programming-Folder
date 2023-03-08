
/*
  join method = first excute completely then second excute completely
  sleep method = wait for the sleep method related threat excute


*/





class one extends Thread{

    public void run(){
      int i=0;
      while(i<10){
        System.out.println("good morning");
        i++;
      }

    }

}


class two extends Thread{

    public void run(){

        int i=0;
        while(i<10){
          System.out.println("GOOD EVENING");
          i++;
        }

    }

}


class three extends Thread{

    public void run(){

        int i=0;
        while(i<10){

            System.out.println("NIGHT GOOD"); 
                try  {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }

          i++;
        }

    }

}






// main class
public class thread_method {
    

    public static void main(String[] args) {
        
        one t1 = new one();
        two t2 = new two();
        three t3 = new three();

        // t1.start();
        // t2.start();
        
        
        

        // // join method
        // t1.start();
    

        // try {
            
        //    t1.join();

        // } catch (Exception e) {
        //     //TODO: handle exception
        //     System.out.println("ERROR SOLVE IS = "+e);
        // }


        // t2.start();


        // sleep method
        t1.start();
        t3.start();




    }


}
