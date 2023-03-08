

public class Pattern {
    
    public static void main(String[] args) {
        
        int count=0;

        for(int i=1; i<=5 ; i++)
        { 
            for(int j=1 ; j<=i ; j++)
            {
                count++;
                System.out.print(count + " ");
                if((j != i))
                {
                    System.out.print("*" + " "); 
                }
               
            }

            System.out.println();
         
        }
            
        int count1=16;
        for(int i=5; i>=1 ; i--)
        {

            for(int j=1 ; j<=i; j++)
            {
                count1--;
                int h; 
                
                h = i;
                h++;
                //   count1--;
                int k = h-j;
                int m = k-j;
                
                System.out.print(count1 - m + " ");
         
                        if((j != i))
                        {
                            System.out.print("*" + " "); 
                        }

               
            }
          

            System.out.println();

        }   



        // ------------------------------------------------------------------------
        
       /*  
        int count=0;    
        for(int i=1; i<=5 ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {   
                count++;
                System.out.print(count + " ");
                if((j != i))
                {
                    System.out.print("*" + " "); 
                }
               
            }
            System.out.println();
        }

        int k = 8; count=11;
        for(int i=6; i>=1 ; i--)
        {
            for(int j=1 ; j<=i; j++)
            {
                System.out.print(count + " ");
                count++;
                if((j != i))
                {
                    System.out.print("*" + " "); 
                }
            }
            count-=1;
            count-=k; 
            k-=2;
            System.out.println();
        }

      */
        



    }

}


// pirangut , vanalika project , mumbai highway 


/*
 
1 
2 * 3 
4 * 5 * 6 
7 * 8 * 9 * 10 
11 * 12 * 13 * 14 * 15

 */

/* 
               
                */
                









