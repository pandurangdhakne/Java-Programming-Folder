import java.util.*;

class job{

    public void detailes()
    {

        int key[] = {4,1,1,1}; //new int[4];
        int value[] = {20,10,40,30}; //new int[4];
        char [] jobs = {'a','b','c','d'};//new char[4];

        Scanner sc = new Scanner(System.in);
/*
        for(int i=0 ; i<4 ; i++ )
        {
            System.out.print("Enter jobs: ");
            jobs[i] = sc.next().charAt(0);
            System.out.println();
            System.out.print("Enter key: ");
            key[i] = sc.nextInt();
            System.out.println();
            System.out.print("Enter value: ");
            value[i] = sc.nextInt();
            System.out.println();

        }
*/


        System.err.println("\n \n");

        System.out.println("jobs  key  value");
        for(int i=0 ; i<value.length ; i++)
        {
            System.out.println(jobs[i]+"      "+key[i]+"      "+value[i]);
        }


        System.out.println("Temporary Array");
      
        int Newvalue[] = new int[value.length];
        int Newkey[] = new int[key.length];


        for(int i=0 ; i<value.length ; i++)
        {
            Newkey[i] = key[i];
            Newvalue[i] = value[i]; 

        }

     

      

        Arrays.sort(key);  Arrays.sort(value); // sort

        int Bkey = key[key.length - 1];
        // System.out.println(Bkey);  // 4
        int Bvalue = value[value.length - 1];
        // System.out.println(Bvalue); // 40

        System.out.println();
// tmporary array print
        /*
        for(int i=0 ; i<value.length ; i++)
        {
            System.out.println(Newkey[i]+ "  " + Newvalue[i]);
        }
        */
        char H='0' ; int D=0;
        int Newsum[] = new int[value.length]; int sum;    
        for(int i=0 ; i<value.length ; i++)
        {
            
            if(Bkey == Newkey[i])
            {
                 H = jobs[i];
                 D = Newvalue[i];
                

            }
  
            else
            {
               sum =  D + Newvalue[i];
               System.out.println( H +" + "+ jobs[i]+" : "+sum );
               Newsum[i] = sum;
            }

            
        }

        System.out.println();
        Arrays.sort(Newsum);
int F = Newsum[4-1]; // F = 60
 
        for(int i=0; i<value.length ; i++)
        {
            for(int j=i+1 ; j<value.length ; j++)
            {
                if(Newvalue[i] + Newvalue[j] == F)
                {
                   System.out.print(jobs[i] + " + " + jobs[j] + " : " + F);
                }
            }
        
        }

        





    }


}

public class DeadLine_Profit {
         public static void main(String[] args) {
         
            job j  = new job();
            j.detailes();

     }

}
