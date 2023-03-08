public class FrequencyNum {
 
    public static void main(String[] args) {
        
       int a = 11102355;
       String str = Integer.toString(a);
       System.out.println(str);

       int size = str.length();

       for(int i=0 ; i<size ; i++)
       {
           char str1 = str.charAt(i);
           int count=0;
        //    System.out.println(str1);
            for(int j=0 ; j<size ; j++)
            {
               char str2 = str.charAt(j);
               
               if(str1 == str2)
               {
                   count = count + 1;
               }
         
            }

            System.out.println("number = "+ str1 +" count = "+ count);
       }

    }

}
