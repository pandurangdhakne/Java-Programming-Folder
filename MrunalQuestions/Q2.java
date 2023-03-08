/*

Duplicate charaters find out

*/



public class Q2 {
    
    static String DuplicatChar(String str)
    {

        String newStr = "";
   

        for(int i=0 ; i<str.length() ; i++)
        {

            char ch = str.charAt(i);

            if(newStr.indexOf(ch) == -1)
            {
                newStr += ch;
            }
           

        }

        return newStr;
        
    
    }
    public static void main(String[] args) {
       /*  
        String s = "";
        System.out.println(s.indexOf("a"));   // -1
       */

          String str = "abcbakl";

          System.out.println("Current String: " + str);

          System.out.println("new string: " + DuplicatChar(str));

        

    }

}
