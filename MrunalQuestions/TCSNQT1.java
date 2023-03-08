

import java.util.*;

public class TCSNQT1 {
     

    public static String element(String A , String B) 
    {
        
        


// operation 1
                       
            String la = A.toLowerCase();
            String lb = B.toLowerCase();
   
            char [] operation1_ca = la.toCharArray();
            char [] operation1_cb = lb.toCharArray();
   
            String operation1_sub = "";
   
                 int m = operation1_ca.length - 1;
                 Random randI = new Random();
                 int subStrLen = randI.nextInt(m);
                 subStrLen = subStrLen + 1;
               //   System.out.println("Random number between 1 and 5: "+ subStrLen);
   
               
               int [] sary = new int[subStrLen];
   
               for(int i=1 ; i<=subStrLen ; i++)
               {
   
                   int n = subStrLen - 1;
                   int h = randI.nextInt(n);
                   n = h + 1;
   
                   sary[i-1] = n;
   
                   operation1_sub = operation1_sub + operation1_ca[n];
   
   
               }
   
               char max = 'A';
               char min = 'z';
   
              
   
               for(int i=0 ; i<operation1_sub.length(); i++)
               {
    
                    if(operation1_sub.charAt(i) < min)
                    {
                       min = operation1_sub.charAt(i);
                    }
   
                    if(operation1_sub.charAt(i) > max)
                    {
                       max = operation1_sub.charAt(i);
                    }
                   
   
               }
   
           
   
               for(int i=0 ; i<sary.length; i++)
               {
   
                   int g  = sary[i];
   
                   la = la.replace(la.charAt(g), min);
   
                   // System.out.println(sary[i] + " i : " + i);
                       
               }
   
              
// operation 2

int count=0;
   
              if(la == lb)
              {
                count++;
              }
              else
              {

                 count--;

              }

          
              return count+"";

                
                    
 

            //  return min + "  " + operation1_sub + "  " + subStrLen   + "    " + la;

             
    }

    
    public static void main(String[] args) {
        
  
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

      System.out.println(element(A, B));

            
             


              




             


      

    //    System.out.println(j);
   

   
//   for (int i = 0; i < 5; i++) {
    
//     Random randI = new Random();
//     int myRandInt = randI.nextInt(3);
//     myRandInt = myRandInt+1;
//     System.out.println("Random number between 1 and 100: "+myRandInt);

//   }
 
       

    }

} 
