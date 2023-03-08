
// MultiThreading with extends 

// when we use exception handling in this program one rule is remaiber always when we give the @Override then that process handle the exception our own try_catch method


class A extends Thread{

@Override 

 public void run()
 {
     for (int i = 0; i < 5; i++) {
        System.out.println("stereo gym");
     }
 }


}




public class multithreadExtend {

    
    public static void main(String[] args) {
    
        // this main block is 1st thread   JVM
        A obj = new A();

        obj.start();  // 2nd thread
        

        for (int i = 0; i < 5; i++) {
            System.out.println("musakare lage");
         }

    }


}
