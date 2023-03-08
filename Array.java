



public class Array {
    
  public static void main(String[] args) {
      
   String [] cars = {"bmw","scorpio","mursadies"};
   System.out.println(cars[0]);
   System.out.println(cars[1]);
   System.out.println(cars[2]);

    // length of array
    System.out.println("lenght= "+cars.length);

   // for loop
     for(int i=0 ; i < cars.length; i++){
         System.out.println(cars[i]);
     }
    

    // for - each loop
    for (String key : cars) {
        System.out.println("key= "+key);
        
    }



System.out.println("\n\n");

    int[] range = {0,1,2,3,4,5};
    System.out.println(range[0]);
    System.out.println(range[1]);
    System.out.println(range[2]);
    System.out.println(range[3]);
    System.out.println(range[4]);
    System.out.println(range[5]);

    // length
    System.out.println("lenght of range= "+range.length);
// for loop
    for(int i=0;i<6;i++){
        System.out.println("range= "+range[i]);
  
    }

    // for - each loop
    for (int i : range) {

        System.out.println("for each index= "+i);
    }
     

   // Multi-dimentional array
    int [][] matrix = {{1,2,3},{2,5,6}};
    int x = matrix[1][2];
    System.out.println(x);

System.out.println("\n\n");

    // multi- dimentional array with for loop
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            System.out.println(matrix[i][j]);
        }
    }




  }


}
