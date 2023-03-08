
class MyThread1 extends Thread{

   public MyThread1(String name){
       super(name);
   }

   public void run(){

    int i=0;
    while(i<20){

        System.out.println("my name is "+name);

        i++;

    }

   
}



public class thread_priorities {
    

    public static void main(String[] args) {
        
        MyThread1 t1 = new MyThread1("pandurang");
        MyThread1 t2 = new MyThread1("omkar");
        MyThread1 t3 = new MyThread1("kiran");
        MyThread1 t4 = new MyThread1("bhushan");
        MyThread1 t5 = new MyThread1("sanskar");

        // t1.start();
        // t2.start();
        // t3.start();
        // t4.start();
        // t5.start();
        
    }


}
