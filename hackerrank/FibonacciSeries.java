public class FibonacciSeries {
    

    static int fun (int n)
    {
        if(n==0 || n==1){

            return n;
            
        }
        else{

            return fun(n-1) + fun(n-2);
        }

        
        
        

    }

public static void main(String[] args) {

        
        System.out.println(fun(6));
        
        
      
    }

}
