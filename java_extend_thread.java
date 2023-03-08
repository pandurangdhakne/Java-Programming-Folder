
class MyThread1 extends Thread{

    @Override
   public void run(){

    //    while(true){
    //        System.out.println("MyThread 1st");
    //    }

        for(int i=0; i<=10; i++){
            System.out.println("MyThread 1st");
        }

   }
}

class MyThread2 extends Thread{
    
    @Override
    public void run(){
 
        // while(true){
        //     System.out.println("MyThread 2nd");
        // }
 
        for(int i=0; i<=10; i++){
            System.out.println("MyThread 2nd");
        }
    }
 }
 



public class java_extend_thread {

    public static void main(String[] args) {
        
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start(); // this is automatically run the thread class functions
        t2.start(); // this is automatically run the thread class functions
        
    }

}



// output 

/*

MyThread 1st
MyThread 1st
MyThread 1st
MyThread 1st
MyThread 2nd
MyThread 2nd
MyThread 2nd
MyThread 2nd
MyThread 2nd
MyThread 2nd
MyThread 2nd
MyThread 1st
MyThread 1st
MyThread 2nd
MyThread 2nd
MyThread 2nd
MyThread 2nd
MyThread 1st
MyThread 1st
MyThread 1st
MyThread 1st
MyThread 1st

*/
