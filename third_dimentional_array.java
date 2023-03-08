



public class third_dimentional_array {

    public static void main(String[] args) {
        
        int [][][] arr = new int[2][3][4];

        arr[0][0][0] = 101;
        arr[0][0][1] = 201;
        arr[0][0][2] = 301;
        arr[0][0][3] = 401;
       
        System.out.println(arr[0][0][0]);
        System.out.println(arr[0][0][1]);
        System.out.println(arr[0][0][2]);
        System.out.println(arr[0][0][3]);

 
        
System.out.println("\n\n");

        for(int i=0; i<arr.length; i++)
        {
            
            for(int j=0; j<arr[i].length; j++)
            {
                
                for(int k=0; k<arr[k].length; k++)
                {
                    System.out.println(arr[i][j][k]);
                }

            }

        }





    }

}
