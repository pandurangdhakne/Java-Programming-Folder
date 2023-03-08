public class break_continue {
    
   public static void main(String[] args) {
       
       int i=0;
       while(i<=5){
    
        if(i==3){
            break;
        }
                System.out.println("repeat="+i);
                i++;
               
       }


       for(int j=0;j<5;j++)
       {
           if(j == 2){
               continue;

           }
           System.out.println("index="+j);
       }

   }


  
    
}
