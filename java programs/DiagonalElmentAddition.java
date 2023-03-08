// middle element only once to take


public class DiagonalElmentAddition {
    
       public static void main(String[] args) {
           
          int [][] a = {{1,2,3},{4,5,6},{7,8,9}};

          for(int i=0 ; i<a.length ; i++)
          {
              for(int j=0 ; j<a[i].length ; j++)
              {
                  System.out.print(a[i][j] + " ");
              }
              System.out.println();
          }

         
// left side start 
int m = a.length / 2;   // 1

          int ld = 0;
          int rd = 0;
          for(int i=0 ; i<a.length ; i++)
          {
              for(int j=0 ; j<a[i].length ; j++)
              {
                 if(i == j)
                 {
                     ld = ld + a[i][j];
                 }

              } 

              for(int j=a[i].length - 1 ; j>=0 ; j--)
              {
            
              
                    if( i == j)
                    {
                      if(m == i && m == j)
                      {
                          continue;
                      }
                      rd = rd + a[i][j];
                    }

              } 
          }
        //   System.out.print("ld = "+ ld);
        System.out.print("Total diagonal elements addition = " + "["+  (ld + rd)  +"]" );

    

// right side start



          /*
            for(int i=0 ; i<a.length ; i++)
            {
                
                for(int j=a[i].length - 1 ; j>=0 ; j--)
                {
              
                
                      if( i == j)
                      {
                        if(m == i && m == j)
                        {
                            continue;
                        }
                        rd = rd + a[i][j];
                      }
                     


                } 
                
                System.out.println();
            }
            */

            // System.out.print("rd = " + rd + "\n");

            // System.out.print("Total diagonal elements addition = " + "["+  (ld + rd)  +"]" );


       }

}
