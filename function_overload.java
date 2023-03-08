public class function_overload {
    
   static int sum(int a,int b){
       return a+b;
   }
   
   static double sum( double a, double b){
       return a+b;
   }

   public static void main(String[] args) {
      int mynum1 = sum(2,3);
      double mynum2 = sum(20.36,60.5);
      System.out.println("int sum="+mynum1);   
      System.out.println("int double="+mynum2);

   }

}
