public class RecursionAcendingOrderPrint {
    
    static void fibo(int n)
    {

        if(n == 11)
        {
            return;
        }

        System.out.print(n + " ");
        fibo(n+1);

    }

    public static void main(String[] args) {
        
        fibo(1);

    }

}
