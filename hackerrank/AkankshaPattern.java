public class AkankshaPattern {
    
        public static void main(String[] args) {
            
            int count = 0;

            for(int i=1 ; i<=6 ; i++)
            {
                for(int j=1 ; j<=i ; j++)
                {
                    count++;
                    int h;
                    h = i;
                    h++;
                    if( i%2 == 0)
                    {
                       int k = h - j;
                       int m = k - j;

                       System.out.print((count + m ) + " ");

                       if((i != j))
                       {
                        System.out.print(" * ");
                       }
                    }
                    else{
                        System.out.print(count + " ");
                        if((i != j))
                        {
                         System.out.print(" * ");
                        }
                    }
                }
                System.out.println();
            }
            
        }

}
