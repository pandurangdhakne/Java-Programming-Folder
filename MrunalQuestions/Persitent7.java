/*

    Given a route in a straight line N,buses operate between various bus station.
    There is a workstation at the start of the route . The distance of the bus stations from the 
    workstation are calculated. The transportation authority wishes to 

    input : row=4  col=2
             2   8
             6   10
             12  14
             12  20


    output:  count : 2     two routes are overlapped         


note :- sort the each row in the matrix then apply the logic on this type of problem

 */




import java.util.*;

public class Persitent7 {
    
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[4][2];

        int count=0;
        
       

        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[i].length ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

         System.out.println();
 
       

         for(int i=0 ; i<arr.length ; i++)
         {
            int temp;

             for(int j=0 ; j<arr[i].length ; j++)
             {
                
                  for(int k=j+1 ; k<arr[i].length ; k++)
                  {

                      if(arr[i][j] > arr[i][k])
                      {

                        temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;

                      }

                  }

                  
                  System.out.print(arr[i][j] + "    ");
                   
             }

             System.out.println();
         }
   


         System.out.println();
 
         for(int i=0 ; i<arr.length ; i++)
         {
            


                    for(int j=0 ; j<1; j++)
                    {
                        
                            
                                  if(0 < i)
                                  {
                                   
                                        if(j == 0)
                                        {

                                            if((arr[i][j] < arr[i-1][j+1]) && (arr[i-1][j+1] < arr[i][j+1]))
                                            {
                                                System.out.println(arr[i][j] + "      " + arr[i-1][j+1]  + "      "+ arr[i][j+1]);
                                                count++;
                                            }

                                        }
                            
                                  }      
                            
                        
                    }


             

             System.out.println();
         }
          

System.out.println();

System.out.println("count : " + count);
         

      }

}
