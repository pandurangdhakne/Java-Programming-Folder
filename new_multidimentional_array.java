



public class new_multidimentional_array {
    
    public static void main(String[] args) {
        
     int [][] flat_number = new int [2][3];
     flat_number[0][0] = 101;
     flat_number[0][1] = 102;
     flat_number[0][2] = 103;
     flat_number[1][0] = 201;
     flat_number[1][1] = 201;
     flat_number[1][2] = 203;

     System.out.println("flat_number[0][0] = " +flat_number[0][0]);
     System.out.println("flat_number[0][1] = " +flat_number[0][1]);
     System.out.println("flat_number[0][2] = " +flat_number[0][2]);
     System.out.println("flat_number[1][0] = " +flat_number[1][0]);
     System.out.println("flat_number[1][1] = " +flat_number[1][1]);
     System.out.println("flat_number[1][2] = " +flat_number[1][2]);

     System.out.println("\n\n");


                    for(int i=0; i<flat_number.length; i++)
                    {

                        for(int j=0; j<flat_number[i].length; j++)
                        {
                            System.err.println("flat number = " +flat_number[i][j]);
                        }

                    }



    }


}
