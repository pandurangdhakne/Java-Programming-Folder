
/*
   
main problem is =   sum(4)
and sub-problem is = sum(3) + 4;


Equation is        sum(4) = n + sum(3)


 */




public class SumOfNaturalNumber {
    
    static int printNumber(int n)
    {

       if(n == 1)
       {
        return 1;
       } 
       
       return  printNumber(n - 1) + n;


    //    return n + printNumber(n - 1);

       


    }
   public static void main(String[] args) {
    

   int a =  printNumber(4);

   System.out.println(a);
        



   }

}


