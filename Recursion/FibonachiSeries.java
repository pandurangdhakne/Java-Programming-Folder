public class FibonachiSeries {
    


     public static void main(String[] args) {
        
           int a = 0; int b = 1;

           System.out.print(a + " " + b + " ");

           for(int i=2 ; i<10 ; i++)
           {

            int c = a + b;
             a = b;
             b = c;


             System.out.print(c + " ");

           }


           // Output: 0 1 1 2 3 5 8 13 21 34 


     }


}
