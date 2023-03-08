
/**
 * LTI_question1
 
  pattren base

0 
0 3 
0 3 6 
0 3 6 9 
0 3 6 9 12 

 */

import java.util.*;

public class LTI_question1 {

    public static void main(String[] args) {

        int k = 0;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) {
                k = j * 3;
                System.out.print(k + " ");
            }
            // k=0;
            System.out.println();
        }

    }

}