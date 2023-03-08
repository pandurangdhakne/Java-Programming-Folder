/*  Syntax of function

// every function under write the "return" function complusarly

public class methods_function {
    

    static void myMthode()  // function or methode define
    { 
        // code to be executed
    }

    public static void main(String[] args) {
        myMthode(); // function or method calling
    }

}


*/

public class methods_function{

   static void myMthode(){
       System.out.println("Hey this my first function");
   }

   static int sum(int a,int b){
       int c;
       c=a+b;
       System.out.println("sum="+c);
       return 0;
   }

   public static void main(String[] args) {
       myMthode();
       sum(5,6);
   }



}