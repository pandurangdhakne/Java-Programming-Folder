/*

    thread()     // extend
    thread(string name)   // extebd
    thread(runnable r) // runnable
    thread(runnable r, string name)  // runnable


*/







class MyThread1 extends Thread{

    public MyThread1(String name){
        super(name);
    }


   
   public void run(){
   
    for(int i=0 ; i<=3; i++){
        System.out.println("i am thread");
    }
       

   }
}



public class java_thread_constructor {

    public static void main(String[] args) {
        
      MyThread1 t1 = new MyThread1("nikita");  
      MyThread1 t2 = new MyThread1("pandurang");

        t1.start(); // this is automatically run the thread class functions
        t2.start(); // this is automatically run the thread class functions
        
            System.out.println(" The id of the thread t1 is: "+ t1.getId());
            System.out.println(" The name of the thread t1 is: "+ t1.getName());

            System.out.println(" The id of the thread t2 is: "+ t2.getId());
            System.out.println(" The name of the thread t2 is: "+ t2.getName());


    }


}
