
/*
 
  Math.pow(2,0) = 1
  Math.pow(2,1) = 2
  Math.pow(2,2) = 4
  Math.pow(2,3) = 8
  Math.pow(2,4) = 16
  Math.pow(2,5) = 32
  Math.pow(2,6) = 64
  Math.pow(2,7) = 128
  

  128 64 32 16 8 4 2 1


  
        //    7  = 0111
        //    12 = 1100 

        //    and->0100
        //    xor->1011  

 */
import java.util.*;

public class AON1 {

    public static void main(String[] args) {

        // 7 12 16 10 6
        // 2 4 32 8 16 64

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((arr[i] & arr[j]) >= (arr[i] ^ arr[j])) {
                    count++;
                }
            }

        }

        System.out.println("count : " + count);

    }

}
