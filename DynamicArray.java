import java.util.Scanner;

import java.util.Scanner;

public class DynamicArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt(); // input rows
        int [][] a = new int[rows][]; // dyanmic array declaration

        int sizeCol;int colElemnt;

        for(int i=0 ; i<a.length ; i++)
        {
            System.out.print("Enter the size of column: ");
            sizeCol = sc.nextInt();

            a[i] = new int[sizeCol];

            for(int j=0 ; j<a[i].length ; j++)
            {
                
                System.out.print("column element: ");
                colElemnt = sc.nextInt(); 
                a[i][j] = colElemnt;  // user define input   // 2d also input like this
                
            }
        }

        System.out.println();

        for(int i=0 ; i<a.length ; i++)
        {

            for(int j=0 ; j<a[i].length ; j++)
            {
                
              System.out.println("  a ["+ i +"]["+ j +"] = " + a[i][j]);
                
            }
        }
 
    }

}
