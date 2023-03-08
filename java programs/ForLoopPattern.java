public class ForLoopPattern {
    
     public static void main(String[] args) {
         int k=1;
         for(int i=0 ; i<5 ; i++)
         {

            for(int j=0 ; j<=i ; j++)
            {

                if(j == 0)
                {
                    System.out.print(k + " ");
                }
                else
                {

                    k++;
                    System.out.print(k + " ");
                }

            }
            System.out.println();
         }

     }


}
