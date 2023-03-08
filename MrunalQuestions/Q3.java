public class Q3 {
    
    static String DuplicatChar(String str)
    {
        String newStr = "";
       
        String subStr = "";

     

        for(int i=0 ; i<str.length() ; i++)
        {

            char ch = str.charAt(i);

            if(newStr.indexOf(ch) == -1)
            {
               
                if(str.indexOf(ch) == 0  || str.indexOf(ch) == str.length()-1 )
                {

                     newStr += ch;    

                }
                
                else
                {
                        newStr += ch;

                        int beforeIndex = str.indexOf(ch) - 1;
                        int afterIndex  = str.indexOf(ch) + 1;
                        
                        char bch = str.charAt(beforeIndex);
                        char ach = str.charAt(afterIndex);
        
        
                        if(subStr.contains(String.valueOf(bch)) && newStr.contains(String.valueOf(ach)))
                        { 

                            subStr += ch;

                        }
                      
                        
                        

                       
                        
                }
               

                
            }

            else
            {
                subStr += ch;

                
            }
          
            
            

        }

       
      
     
        

        return subStr;
        
    
    }

    public static void main(String[] args) {
        
        // String str = "abcbakl";       // ba
        // String str = "abcbdakl";   //bda
        String str = "abcbbkcdbkd";   //bbkcdb
                    
        System.out.println("Current String: " + str);

        // DuplicatChar(str);

        System.out.println("Sub string: " + DuplicatChar(str));

        System.out.println("Sub string length: " + DuplicatChar(str).length());

    }

}
