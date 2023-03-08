import java.util.*;

public class KthLargestNum {
 
    public static void main(String[] args) {
        
        int k,temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("which position number you want = ");
        k = sc.nextInt();

        int a[] = {5,8,1,2,11};

        for(int i=0 ; i<a.length ; i++)
        {
            for(int j=i+1 ; j<a.length ; j++)
            {
                if(a[i] > a[j])
                {
 
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                }
            }
            
             
            if(i == k-1)
            {
                System.out.println("you got this number = " + a[i]);

                 break;
            }

           
        }

    }

}
