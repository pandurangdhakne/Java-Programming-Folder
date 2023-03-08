/**
 * TakeDiscountOrNot
 

 Problem
There are NN items in a shop. You know that the price of the ii-th item is A_iA 
i
​
 . Chef wants to buy all the NN items.

There is also a discount coupon that costs XX rupees and reduces the cost of every item by YY rupees. If the price of an item was initially \leq Y≤Y, it becomes free, i.e, costs 00.

Determine whether Chef should buy the discount coupon or not. Chef will buy the discount coupon if and only if the total price he pays after buying the discount coupon is strictly less than the price he pays without buying the discount coupon.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases. The description of the test cases follows.
Each test case consists of two lines of input.
The first line of the test case contains three space-separated integers — NN, XX, and YY.
The second line contains NN space-separated integers — A_1, A_2, \ldots, A_NA 
1
​
 ,A 
2
​
 ,…,A 
N
​
 .
Output Format
For each test case, output COUPON if Chef should buy the discount coupon, and NO COUPON otherwise.
Each letter of the output may be printed in either lowercase or uppercase. For example, the strings coupon, CouPoN, and COUPON will all be treated as equivalent.

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq N \leq 1001≤N≤100
1 \leq X, Y \leq 10^51≤X,Y≤10 
5
 
1 \leq A_i \leq 10^51≤A 
i
​
 ≤10 
5
 
Sample 1:
Input
Output
5
4 30 10
15 8 22 6
4 40 10
15 8 22 6
4 34 10
15 8 22 6
2 10 100
60 80
3 30 5
50 60 50
COUPON
NO COUPON
NO COUPON
COUPON
NO COUPON
Explanation:
Test case 11: The original cost of the items is 15 + 8 + 22 + 6 = 5115+8+22+6=51. Buying the coupon costs 3030, and after buying it the cost of buying all the items is 5 + 0 + 12 + 0 = 175+0+12+0=17. The total cost of buying everything with the coupon is 30 + 17 = 4730+17=47, which is strictly less than 5151. So, Chef will buy the coupon.

Test case 22: The original cost of the items is 15 + 8 + 22 + 6 = 5115+8+22+6=51. Buying the coupon costs 4040, and after buying it the cost of buying all the items is 5 + 0 + 12 + 0 = 175+0+12+0=17. The total cost of buying everything with the coupon is 40 + 17 = 5740+17=57, which is more than 5151. So, Chef will not buy the coupon.

Test case 33: The original cost of the items is 5151. Buying the coupon costs 3434, and the cost of buying all the items after using it is 1717, making the total cost 34 + 17 = 5134+17=51. Since this is not strictly less than the original cost, Chef won't buy the coupon.

Test case 44: The original cost of the items is 140140, the coupon costs 1010, and the cost of buying everything after using the coupon is 00. Since 10 + 0 \lt 14010+0<140, Chef will buy the coupon.





 */
import java.util.*;

import javax.sound.midi.Soundbank;
public class TakeDiscountOrNot {

    public void onlineJudge()
    {


        int X,Y,N;
        Scanner sc = new Scanner(System.in);

        int count = 0; int count2 = 0;
        System.out.print("size: ");  N = sc.nextInt();
        System.out.print("X: ");  X = sc.nextInt();
        System.out.print("Y: ");  Y = sc.nextInt();

        int [] item  = new int[N];
        int [] it = new int[N];

        System.out.print("Enter the items : ");
        for(int i=0; i<item.length ; i++)
        {
            item[i] = sc.nextInt();
            count = count + item[i];
        }

        System.out.println("count : " + count);

        for(int i=0 ; i<item.length ; i++)
        {
            int element;
            if(item[i] >= Y)
            {
               element = item[i] - Y;
               it[i] = element; 
            }
            else
            {
                it[i] = 0;
            }
            System.out.print("item array values : " + item[i]); System.out.println();
            System.out.print("it array values : " + it[i]);
            System.out.println();
            count2 = count2 + it[i];


        }

        System.out.println();
        System.out.println("count2 : "+ count2);


        int m;

        m = count2 + X;

        if(m > count)
        {
            System.out.println("Not Coupon" + "\n");
        }
        else
        {
            System.out.println("Coupon" + "\n");
        }


    }
    public static void main(String[] args) {
        
        
       TakeDiscountOrNot t1 = new TakeDiscountOrNot();
        
       Scanner sc = new Scanner(System.in);
       int test_case;
       System.out.print("Enter the amount of test case : ");
       test_case = sc.nextInt();

       for(int i=0 ; i<test_case; i++ )
       {
           t1.onlineJudge();
       }

        
        
        
    }
}