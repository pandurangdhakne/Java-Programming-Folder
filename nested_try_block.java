




public class nested_try_block {
    
    public static void main(String[] args) {
        
    int [] arr = {10,20,30,40};
    int [] array = {100,200,300,400};


       try
       {
        System.out.println("array index output is: "+array[1]);   
            try 
            {
             System.out.println("array index output is: "+arr[10]);   
            } 
            catch (Exception e) {
                //TODO: handle exception
                System.out.println("second time");
            }
           
       } 
       catch (Exception e) {
           //TODO: handle exception
           System.out.println("first time");
       }

    }
}
