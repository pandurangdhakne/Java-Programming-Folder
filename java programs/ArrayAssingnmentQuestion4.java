/*

input: {41,67,95,28,37,61,45,99,70,42}


output: {41,61,67,45,95,99,28,70,37,42}


 
*/

public class ArrayAssingnmentQuestion4 {
    
    public static void main(String[] args) {
       

       int [] a = {41,67,95,28,37,61,45,99,70,42};
       int size=a.length ;  int rem;
       int [] b = new int[size];

       for(int i=0 ; i<a.length ; i++)
       {
           int j; 

           j=i*2;

           int sum=0;
     
          if(j>=0 && j<10)
          {
              b[j]  =  a[i];
          }
          else
          {
              while (j!=0) {
                
                  rem = j % 10;
                  sum = sum + rem;
                  j = j/10;
              }

              b[sum] = a[i];
          }
        
            
       }

      
       System.out.print("Input: ");
       for(int i=0 ; i<a.length ; i++)
       {
           System.out.print(a[i] + " ");
       }
System.out.println();

       System.out.print("Output: ");
       for(int i=0 ; i<b.length ; i++)
       {
           System.out.print(b[i] + " ");
       }


    }

}
