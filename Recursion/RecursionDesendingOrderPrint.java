
// print 1 to 10 numbers using Recursion method

public class RecursionDesendingOrderPrint {
    
    static void fibo(int n)
    {
        if(n == 0)
        {
            return;
        }

        System.out.print(n + " ");  // 10 to 1

        fibo(n-1); System.out.print("     ");

        System.out.print(n + " "); // 1 to 10

    }

    public static void main(String[] args) {
        
          fibo(10);

    }

}
