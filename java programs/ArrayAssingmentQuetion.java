
public class ArrayAssingmentQuetion {
    
     public static void main(String[] args) {

        int [] a= {6,4,2,8,5};

        System.out.print("Output: ");
        for(int i=0 ; i<a.length ; i++)
        {
            for(int j=i+1 ; j<a.length ; j++)
            {
                if((a[i]+a[j]) == 10)
                {
                    System.out.print(a[i]+ " " +a[j]+" ");
                }
            }
        }
 
     }

}
