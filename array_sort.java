
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class array_sort {
    
    public static void main(String[] args) {
        
        int [] arr = new int[] {10,50,5,3,60};
// simple array
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(" "+arr[i]+" ");
        }

        System.out.println();
// sort method 1st        

Arrays.sort(arr);

for (int i : arr) {

    System.out.print(" "+i+" ");
}

System.out.println();
System.out.println();

// sort method 2nd accending order


for (int i = 0; i < arr.length; i++)   
{  
            for (int j = i + 1; j < arr.length; j++)   
            {  
                int tmp = 0;  
                if (arr[i] > arr[j])   
                {  
                tmp = arr[i];  
                arr[i] = arr[j];  
                arr[j] = tmp;  
                }  
            }  
//prints the sorted element of the array  
System.out.print(" "+arr[i]+" ");  
}  


System.out.println();
System.out.println();

// sort method 4th decending order

for(int i=0 ; i<arr.length ; i++)
{
    for(int j=i+1 ; j<arr.length ; j++)
    {
        int temp=0;
        if(arr[i] < arr[j]) 
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    System.out.print(" "+arr[i]+" ");
}

System.out.println();
System.out.println();


// sort method 5th

Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};   
// sorts array[] in descending order   
Arrays.sort(array, Collections.reverseOrder());   
System.out.println("Array elements in descending order: " +Arrays.toString(array));


                                                                                                                                                           


    }

}
