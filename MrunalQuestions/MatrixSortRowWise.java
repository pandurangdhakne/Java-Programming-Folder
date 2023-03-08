
import java.util.*;

public class MatrixSortRowWise {
    
    public static void main(String[] args) {
        
         /* 
    int[] arr = { 8, 2, 10, 5, 12,  2 , 11, 16, 30 };

    System.out.print("orignal array:  ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "  ");
    }


    System.out.println();

    System.out.print("sorted array:  ");

    for(int i=0 ; i<arr.length ; i++)
    {
      int temp;

       for(int j=i+1 ; j<arr.length ; j++)
       {

        if(arr[i] > arr[j])
        {

          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;

        }
        

       }

 System.out.print(arr[i] + "   ");
    }


*/

int [][] arr = {{5,1,0},{8,6,3},{10,9,100},{20,30,13}};

System.out.print("original array:   "+ "\n");
for(int i=0 ; i<arr.length ; i++)
{

  for(int j=0 ; j<arr[i].length ; j++)
  {

    System.out.print(arr[i][j] + "   ");

  }

  System.out.println();

}

System.out.println("\n");

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

        // System.out.print(arr[i][j] + "     ");

  }

  System.out.println();

}

System.out.println("\n");

for(int i=0 ; i<arr.length ; i++)
{

   for(int j=0 ; j<arr[i].length ; j++)
   {

    System.out.print(arr[i][j] + "   ");

   }
System.out.println();
}




    }

}
