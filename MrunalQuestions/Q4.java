
/*

step wala program ahe mrunal ne sangitalela




 */
import java.util.*;

public class Q4 {
    
    public static void main(String[] args) {
        

        int count = 0;
        Random rand = new Random();
        
        for(int i = 1 ; i<=4 ; i++)
        {
            int sum = 0; 
            for(int j=1 ; j<=4 ; j++)
            {

              int temp = rand.nextInt(2)+1;
              System.out.println(temp);

                    sum = temp + sum;
                    if((sum) == 4)
                    {                   
                        count++;

                        break;
                    }


            }

            System.out.println("\n");


        }

        System.out.println("\n" + "count : " + count);

    }


}
