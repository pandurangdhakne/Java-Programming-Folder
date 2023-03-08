
import java.util.Arrays;

// Anagram program

/*
--> both strigs length are same
--> same characters are included in both string

*/

public class StringQuestion3 {
    
    public static void main(String[] args) {
        
        String s1 = "LISTEN";
        String s2 = "SILENT";

        char [] ch = s1.toCharArray();  // string convert into character Array
        char [] cj = s2.toCharArray();

        Arrays.sort(ch);   // Array sort
        Arrays.sort(cj);

        if(Arrays.equals(ch, cj))
        {
            System.out.print("\n Given both strings are ANAGRAM \n");
        }
        else
        {
            System.out.print("\n Given both strings are Not ANAGRAM \n");
        }
      

    }

}
