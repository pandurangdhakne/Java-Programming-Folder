public class ArrayReturn {
    
    public static int[] take()
    {
           int arr[] = {10,20,30,40};

           return arr;
    }
    public static void main(String[] args) { 
        
        int [] a = take();
        for(int i=0 ; i<a.length ; i++)
        {
            System.out.println(a[i]+" ");
        }


    }

}
