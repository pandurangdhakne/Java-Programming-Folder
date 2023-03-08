// count the special character in a string
// eg : mrunal@#$    answer:3     because special character repeated three for times
import java.util.*;

public class LTI_question2 {
    
  
    static String specialElement(String st)
    {

        int count = 0;
        for(int i=0 ; i<st.length() ; i++)
        {

            char ch = st.charAt(i);

            if((ch >= 'A' && ch <= 'Z' ) || ( ch >= 'a' && ch <= 'z'))
            {
                continue;
            }
            else
            {
                if(ch == ' ')
                {
                    continue;
                }
                else
                {
                    count++;
                }
            }
          
            

        }

        return count + "";
        

    }

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

       String answer =  specialElement(str);

       System.out.println(answer);

    }

}
