import java.util.*;


public class NumConvertIntoWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // single digit code start 






        //  String [] single = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        //  int num;


        //  for(int i=0 ; i<single.length ; i++)
        //  {
        //     System.out.print("Single Digit Value: ");
        //     num = sc.nextInt();

        //     for(int j = 0 ; j<single.length ; j++)
        //     {
            
                  
        //         if(num == j)
        //         {
        //            System.out.print("Single Digit Output: "+ single[j] + " \n"); 
        //         }
               

        //     }
              
             
        //  }






         // single digit code end


         // double digit code start






        //  int dnum;

        //  String [] doubly = {"ten","twinty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};

        //  for(int i=0 ; i<doubly.length ; i++)
        //  {
        //      System.out.print("Double Digit Value: ");
        //      dnum = sc.nextInt();

        //      for(int j=0 ; j<doubly.length ; j++)
        //      {
        //          int rem;

        //          while(dnum > 9)
        //          {
        //              rem = dnum % 10;
        //              dnum = dnum / 10;
        //          }

        //          if((dnum-1) == j)
        //          {
        //              System.out.print("Double Digit Output: "+ doubly[j] +"\n");
        //          }
        //      }
        //  }

   



         // double digit code end



         // 11 to 19 number code start





        
         String [] alenine = {"aleone","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"}; 
         int alnum;

       
         for(int i=0 ; i<alenine.length ; i++)
         {

              System.out.print("input: ");
              alnum = sc.nextInt();

              for(int j=0 ; j<alenine.length ; j++)
              {


                

                while(alnum>10 && alnum<20)
                {
                    int rem;
                      rem = alnum % 10;
                      alnum = alnum/10;

                      if(rem == j-1)
                      {
                          System.out.print("output: "+ alenine[rem-1] +"\n");
                          
                      }
  
                }

                


              }

            


         }    

            
          
        


       












         // 11 to 19 number code end
     


















    }
    
}
