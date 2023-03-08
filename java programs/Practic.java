public class Practic {
 
    public static void main(String[] args) {
        
        int [][] a = {{18,3,8},{12,1,2},{15,6,5}};

        for(int i=a.length - 1 ; i>=0 ; i--)
        {
          
            System.out.print("row: "+ "["+ i +"]");

            for(int j=0 ; j<a[i].length ; j++)
            {
                System.out.print(a[i][j] + " : "  + i+","+j + "      ");
            }

            System.out.println();

        }

    }

}
