/*

Input  : arr[] = {10, 20, 10, 5, 15}
Output : prefixSum[] = {10, 30, 40, 45, 60}

Explanation : While traversing the array, update 
the element by adding it with its previous element.
prefixSum[0] = 10, 
prefixSum[1] = prefixSum[0] + arr[1] = 30, 
prefixSum[2] = prefixSum[1] + arr[2] = 40 and so on.

*/

public class PriffixNumberAdditionInArray {
    

    public static void main(String[] args) {
        

        int [] arr = {10,20,10,5,15};

        int [] preffix  = new int[arr.length];


        preffix[0] = arr[0];

        for(int i=1 ; i<arr.length ; i++)
        {

           preffix[i] = preffix[i-1] + arr[i];

        }

        co
        System.out.print("Input: ");
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+ " ");
        }

        System.out.println("\n");


        System.out.print("Output: ");
        for(int i=0 ; i<preffix.length ; i++)
        {
            System.out.print(preffix[i]+ " ");
        }

    }

}
