

/*

// find the charater how many times occures in the string   " frequency "

input: "abcbabaaazzznnnmklk"



output:         a   5
                b   3
                c   1
                k   2
                l   1
                m   1
                n   3
                z   3


 note: count the character with their number of time repeted                

 */

public class Persitent5 {
    
    public static void main(String[] args) {
        

        String s = "abcbabaaazzznnnmklk";
        
        for(char i = 'a' ; i<='z' ; i++)
        {

            int count = 0 ;
            
            for(int j=0 ; j<s.length() ; j++)
            {

                if(i == s.charAt(j)){

                    count++;

                }


            }

            if(count != 0)
            {
                System.out.println(i  + "   " + count);
            }

            



        }
  
        
  

    }

}
