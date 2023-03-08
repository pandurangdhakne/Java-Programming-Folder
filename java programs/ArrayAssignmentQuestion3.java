/*

write a program find the common element in the following two arrays

input:
array1 = 1,2,3,5;
array2 = 2,1,9,8;

output: 1,2

*/


public class ArrayAssignmentQuestion3 {

    public static void main(String[] args) {
        
        int [] a = {1,2,3,5};
        int [] b = {2,1,9,8};

        System.out.print("output: ");
        for(int i=0; i<a.length ; i++)
        {
            for(int j=0 ; j<b.length ; j++)
            {
                if(a[i] == b[j])
                {
                   System.out.print(b[j]+" ");
                }
              
            }
        }


       

    }

}


