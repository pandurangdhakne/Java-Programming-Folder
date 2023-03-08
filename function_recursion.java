public class function_recursion {
    
     static int revers(int k){
        if(k>0){
            return k - revers(k-1);
        }
        else{
            return 0;
        }
     }

     public static void main(String[] args) {
         int rev = revers(10);
         System.out.println(rev);
     }

}
