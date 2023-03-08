
class MyThread1 implements Runnable{

    public void run(){

        for(int i=0; i<=10; i++){
            System.out.println("MyThread 1st");
        }
    }
}

class MyThread2 implements Runnable{

    public void run(){

        for(int i=0; i<=10; i++){
            System.out.println("MyThread 2nd");
        }
    }
}


// main class
public class java_implement_Runnable_thread {

    public static void main(String[] args) {
        
    MyThread1 bullet1 = new MyThread1();
    Thread gun1 = new Thread(bullet1);
    

    MyThread2 bullet2 = new MyThread2();
    Thread gun2 = new Thread(bullet2);

    gun1.start();
    gun2.start();




    }

}


// output
/*

MyThread 1st
MyThread 1st
MyThread 2nd
MyThread 2nd
MyThread 1st
MyThread 1st
MyThread 2nd
MyThread 2nd
MyThread 2nd
MyThread 1st
MyThread 2nd
MyThread 2nd
MyThread 2nd
MyThread 1st
MyThread 1st
MyThread 1st
MyThread 2nd
MyThread 2nd
MyThread 2nd
MyThread 1st
MyThread 1st
MyThread 1st


*/


