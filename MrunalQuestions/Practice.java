
import java.util.*;

class Practice {
 
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int zero=0;

        int [] B = new int[N];

        for(int i=0 ; i<N ; i++)
        {
            B[i] = sc.nextInt();
        }

        int count=0;

        for(int i=0 ; i<N ; i++)
        {
            if(0 == B[i])
            {
                count++;
            }
        }

        int min=0;
       
       Random rand  = new Random();

       while (count >= 0) {
        
        if(count < K)
        {
 
            for(int j=0 ; j<K ; j++)
            {
 
             int r = rand.nextInt(N);
             System.out.println("rand: " + r);
             if(0 != B[r])
             {
                 B[r] = B[r] - 1;
             }
             else
             {
                  count =  zero++;
             }
 
            }

            min++;

        }
        else if(K == count)
        {
            break;
        }
        else
        {
           min++;
           break;
          
        }



       }

       for(int i=0 ; i<N ; i++)
       {
        System.out.print("Array: " + B[i] + "\n");
       } 

    System.out.println(":" + min);

    }

}