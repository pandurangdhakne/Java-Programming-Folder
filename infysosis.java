/**
 * infysosis
 */


import java.util.Scanner;
import java.util.AbstractMap.SimpleImmutableEntry;


public class infysosis {

   
    public static void main(String[] args) {
        
      int size;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array = ");
      size = sc.nextInt();

      int a[] = new int[size];
      System.out.print("\n Array element giving input from user  = ");
      for(int i=0 ; i<size ; i++)
      {
          a[i] = sc.nextInt();
      }

      System.out.print("\n Array print like this: ");

      for(int i=0 ; i<size ; i++)
      {
          System.out.print(a[i] + "  ");
      }

      for(int i=0 ; i<size ; i++)
      {
          int j = a[i];
          String str = String.valueOf(j);
          String str1 = str.replace('6', '9');
          
          int k = Integer.parseInt(str1);
          a[i] = k;
      }

      System.out.print("\n Array print like this after '6' replace into '9' : ");
      for(int i=0 ; i<size ; i++)
      {
        System.out.print(a[i] + "  ");
      }

      // Reverse array print

      System.out.print("\n Reverse array is: ");   
 
      for(int j=size-1 ; j>=0 ; j--)
      {
        System.out.print(a[j] + " ");
      }

      System.out.print("\n Average of array is: ");

      int sum = 0;
      for(int i=size-1 ; i>=0 ; i--)
      {
          
          sum = sum + a[i];
        
      }
      
        Double avg;

          avg = (double)sum / size ;

          System.out.print(avg);

    }
} 