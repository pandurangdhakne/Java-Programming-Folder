
// find the second largest number in array


public class secLarNum {
 
    public static int largestNumberFind(int a[] , int total)
    {
        for (int i = 0; i < total; i++)
        {
            int temp;
            
            for(int j=i+1 ; j< total; j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a[total - 2];
    }
    
    public static void main(String[] args) {
        
        int [] arr = {9,2,1,60,90};
        int len = arr.length;

        System.out.println("length of array = "+ len);
        int p = largestNumberFind(arr,len);
        System.out.println("second largets number is = "+ p);


    }


}
