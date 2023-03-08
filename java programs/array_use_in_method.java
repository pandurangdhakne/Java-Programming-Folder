
// minimum values in array

public class array_use_in_method {
   
    static void min(int arr[])
    {
        int minimum;
        minimum = arr[0];

        for(int i=1 ; i<arr.length ; i++)
        {
            if(minimum > arr[i])
            {
                minimum = arr[i];

                System.out.print(minimum);
            }
        }
    }

    public static void main(String[] args) {
        
     int arr[] = {33,2,6,4};

     min(arr);

    }
    
}
