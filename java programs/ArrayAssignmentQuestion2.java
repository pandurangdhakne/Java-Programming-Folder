/*

write a program take character array as input,but only print characater do
not print special characters

input: a b $ % c & d 1 e
output: a b c d e

*/


import java.util.*; 

public class ArrayAssignmentQuestion2 {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter size of array: ");
       int size;
       size = sc.nextInt();
       char [] ch = new char[size];
       char [] bh = new char[size];

       System.out.println();
       System.out.print("Enter characters: ");
       for(int i=0 ; i<size ; i++)
       {
           ch[i] = sc.next().charAt(0);
           
       }

       System.out.println();
       for (int i = 0; i < size; i++) {
           
        System.out.print(ch[i]+" ");
       }

       System.out.println();

       
       for(int i=0 ; i<size ; i++)
       {
        
            if((ch[i]>=65 && ch[i]<=90) || (ch[i]>=97 && ch[i]<=122 ))
            {
                bh[i] = ch[i];
            }
            else
            {
                ch[i] = ':';
                bh[i] = ch[i];
            }

           

       }

       System.out.println();
       System.out.print("Without special character: ");
       for(int i=0 ; i<size ; i++)
       {
        
          if(ch[i] != ':')
          {
              bh[i] = ch[i];
              System.out.println(bh[i]);
          }

       }


    }

}
