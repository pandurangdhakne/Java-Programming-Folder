
import java.util.*;


public class VirtusaQ2 {
    

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int [] arr = new int[input];

        int count = 0;

        for(int i=0 ; i<arr.length ; i++)
        {

            arr[i] = sc.nextInt();

        }


         
        int min = arr[0];

        for(int i=0 ; i<arr.length ; i++)
        {

            if(arr[i] < min)
            {

                min = arr[i];

            }


        }

        for(int i=0 ; i<arr.length ; i++)
        {

            if(min == arr[i])
            {
                count++;
            }

        }


        System.out.print("min : " + min +"   "+ "Repeated Time : " + count);


    }


}
