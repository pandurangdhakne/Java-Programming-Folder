
// print first 14 prime number

public class RSL_Q1 {
    
    public static void main(String[] args) {
      /*    // prime number print between 1 to 15

        int i,j;
       for(i=1 ; i<=15 ; i++)
       {

            for(j=2 ; j<=i ; j++)
            {
                    if(i % j == 0)
                    {
                         break;

                    }
            }

            if(i == j)
            {
                System.out.println(j);
            }
            

       }
        
      */



      int i,j,count=0;

            for(i=0 ; i<=100 ; i++)
            {
          
                for(j=2 ; j<=i ; j++)
                {

                        if(i % j == 0)
                        {
                            break;
                        }

                }

                if(i == j)
                {

                    count++;

                    if(count <= 14)
                    {
                        System.out.println(j);
                    }
                     
                }
                

            }

    }

}
