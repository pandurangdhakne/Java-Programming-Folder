import java.util.*;
/*

Write a program to create an array of 'n' integer element.
Where 'n' value should be taken from the user.
Insert the values from the user and find the frequency of digit

input: 
n=5
Enter element in the array:
2
3
6
3
5
2

output:
frequency of 2 is 2
frequency of 3 is 2
frequency of 6 is 1
frequency of 5 is 5

*/

public class ArrayAssignmentQuestion1  {
    
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
         
        int [] arr = new int[n];
        int [] arrnew = new int[n];

        int count=0;

        System.out.println();
        System.out.print("Enter elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i<n ; i++)
        {
            System.out.print("Array elements : "+ arr[i] + " ");
        }

        System.out.println();
        for(int i=0 ; i<n ; i++)
        {
            count = 1;
             if(arr[i] != -1)
             {
                  for(int j=i+1 ; j<n ; j++)
                  {
                      if(arr[i] == arr[j])
                      {
                          count++;

                          arr[j] = -1;
                      }
                  }
             }
             arrnew[i] = count;
        }

       System.out.println();

        for(int i=0;i<n;i++)
        {
            if(arr[i] != -1)
            {
                System.out.println(" frequncy of "+ arr[i] + " of " + arrnew[i]);
            }
        }
        
        

     }

}
