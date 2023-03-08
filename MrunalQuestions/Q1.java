/*

***************************** SHL *****************************

-> Question 
respectively.
The next M lines consist of N space-seperated integers - salesRecord,representing
the grid of sales revenue (can be positive or negative) received from each product each day.

-> Output
Print M space-separated integers representing the maximum revenue received each day.

-> Example
Input:
3   4

100 198 333 323
122 232 221 111
223 565 245 764

Output:
333 232 764



*/

import java.util.*;

public class Q1 {

    public static void maxElement(int no_row , int [][]arr)
    {

        int i=0; 
        int max=0;

        int [] result = new int[no_row];
        while (no_row > i) {
            
            
                for(int j=0 ; j<arr[i].length ; j++)
                {

                    if(arr[i][j] > max){

                        max = arr[i][j];

                    }

                }
 
                result[i] = max;
                max = 0;
                i++;

        }

        printElement(result);

    }

    private static void printElement(int [] result)
    {

        for(int i=0 ; i<result.length ; i++)
        {
            System.out.print(result[i] + "  ");
        }

    }

    public static void main(String[] args) {
        
       int row,col;
       System.out.println("row: ");
       Scanner sc = new Scanner(System.in);
       row = sc.nextInt();
       System.out.println("col: ");
       col = sc.nextInt();

       int [][] arr= new int[row][col];
       
       System.out.println();

       for(int i=0 ; i<row ; i++)
       {

        for(int j=0 ; j<col ; j++)
        {
            arr[i][j] = sc.nextInt(); 
        }

        System.out.println();

       }


       maxElement(row , arr);
  

    }
}