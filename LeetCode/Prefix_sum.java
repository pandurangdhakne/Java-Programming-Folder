

import java.util.*;

public class Prefix_sum {
    

    public static void main(String[] args) {
        

        int [] arr = {10,20,4,6,30,48,58,100};
        int [] sumArr = new int[arr.length];

        int sum=0;

        for(int i=0 ; i<arr.length ; i++)
        {

           sum = sum + arr[i]; 
           sumArr[i] = sum;

        }

        for (int i : sumArr) {
            
            System.err.println(i);

        } 
        

        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        int r = sc.nextInt();

        int toatal =   sumArr[r] - sumArr[l-1];
        System.out.println("total sum of 'l' to 'r' : " + toatal);


    }

}
