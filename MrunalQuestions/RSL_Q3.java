// second maximum number

public class RSL_Q3 {
    
    public static void main(String[] args) {
        

        int [] arr = {500,300,200,100,600};


        int max = arr[0];

        for(int i=0 ; i<arr.length ; i++)
        {
            int temp;

            for(int j=1 ; j<arr.length ; j++)
            {

                if(arr[j] < max)
                {
                    temp = max;
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }

            }


        }
    
        System.out.println();

        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + "  ");
        }

        System.out.println("\nsecond maximum number : " + arr[((arr.length)-2)]);

    }

}
