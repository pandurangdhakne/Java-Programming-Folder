public class Adenza_Q2 {
    
    public static void main(String[] args) {
        

         int [] arr = {2,5,3,5,2,5,1,4,5,6,8,9,3};

         int [] newarr = new int[arr.length];
         int [] frequency = new int[arr.length];

         int max=0;
         int element = 0;

         for(int i=0 ; i<arr.length ; i++)
         {

            int x = arr[i];
            int count=0;

            for(int j=0 ; j<arr.length ; j++)
            {

                    if(x == arr[j])
                    {
                        count++;
                        arr[j] =  -1;
                        
                        newarr[i] = x;
                        frequency[i] = count;

                    }



            }

            // System.out.println(x + "  " + count);

                   if(newarr[i] != -1)
                   {
                    System.out.println(newarr[i] + "  =  " + frequency[i]);

                    if(frequency[i] > max)
                    {
                        max = frequency[i];
                        element = newarr[i];

                    }
                    

                   }


         }


          System.out.println("\n\n");

          System.out.println("Maximum time repeated element and thier frequency : element : "  + element + " :   frequency :  " + max);
/*
 
for(int i =0 ; i<arr.length ; i++)
{
    
    System.out.println(newarr[i] + "  :  " + frequency[i]);
    
    
}

*/

    }

}
