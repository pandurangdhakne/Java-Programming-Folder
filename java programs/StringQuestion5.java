
/*
input : Pandurang Dhakne
output: gnarudnaP enkahD

*/

import java.util.StringTokenizer;


public class StringQuestion5 {
    
    public static void main(String[] args) {
        
        String str = "Pandurang Dhakne";
        StringTokenizer s = new StringTokenizer(str);
        
        // System.out.println(s.hasMoreTokens());   // true
        // System.out.println(s.nextToken());    // pandurang

        while (s.hasMoreTokens()) {
            // System.out.print(s.nextToken());  // pandurang dhakne
            String str1 =  s.nextToken();
           StringBuffer s1 = new StringBuffer(str1);
           System.out.print(s1.reverse()+" ");  // output: gnarudnaP enkahD 
        }


    }

}
