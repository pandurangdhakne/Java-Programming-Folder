/**
 * KnapSack_Fractional
 */

 import java.util.*;

 public class KnapSack_Fractional {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the KnapSack Capacity : ");
        int KCapacity =  sc.nextInt();

        // System.out.println((25/18d));

        int [] profit = {25 , 24 , 15};
        int [] weight = {18 , 15 , 10};

        double [] pw = new double[profit.length];  // {profit / weight}

        for(int i=0 ; i<pw.length ; i++)
        {
            double pd = profit[i];
            double wd = weight[i];

            pw[i] = pd/wd;
        }

        for (double i : pw) {
            
            System.out.print(i + "  ");

        }


        for(int i=0 ; i<profit.length ; i++)
        {

            for(int j=1 ; j<profit.length ; j++)
            {
                int pt,wt;double pwt;
                if(pw[i] < pw[j])
                {
                   pwt = pw[i];
                   pw[i] = pw[j];
                   pw[j] = pwt;

                }
            }

        }


        System.out.println();
        
        for(int i=0 ; i<pw.length  ; i++)
        {
            System.out.println("profit: " + profit[i]);
            System.out.println("weight: "+ weight[i]);
            System.out.println("pw: " + pw[i]);
        }

System.out.println(Math.max(1.388, 1.5));

    }
}