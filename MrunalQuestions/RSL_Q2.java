// string converts into integer without inbuild function

public class RSL_Q2 {
    
    public static void converter(String str)
    {
         /*
       char ch = '0'
       int i = ch;   // i=48 this is the ascii value of 0  and logic bihind the problem is each string number substract form 48
         */
int j=0,k=0;

        System.out.print("after string convertion string: " );
         for(int i=0 ; i<str.length() ; i++)
         {
            char ch = str.charAt(i);

             j = ch;

             k = j-48;

            System.out.print(k);

         }

        

    }

    public static void main(String[] args) {
        
        String str = "123456";

        System.out.print("before string convertion string: " + str + "\n");

        converter(str);





    }

}
