
/*

MIN_PRIORITIES = 1

NORM_PRIORITIES = 5

MAX_PRIORITIES = 10



*/






class MyThread1 extends Thread{

    public MyThread1(String name){
        super(name);
    }

    public void run(){
        int i=0;
        while(i<10)
        {
            System.out.println("my name is "+ this.getName());
            i++;
        }
    }
}





public class java_thread_priorities {
    
    public static void main(String[] args) {
        
        MyThread1 t1 = new MyThread1("pandurang (most important)");
        MyThread1 t2 = new MyThread1("omkar");
        MyThread1 t3 = new MyThread1("kiran");
        MyThread1 t4 = new MyThread1("bhushan");
        MyThread1 t5 = new MyThread1("sanskar");

        // t1.start();
        // t2.start();
        // t3.start();
        // t4.start();
        // t5.start();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        // t5.setPriority(Thread.NORM_PRIORITY);

        // t1.start();
        // t2.start();
        // t3.start();
        // t4.start();
        // t5.start();
       
        
    }



}
