import java.util.Scanner;

public class StringQuestion1 {
    
    public static void main(String[] args) throws StringIndexOutOfBoundsException {
        
        Scanner sc = new Scanner(System.in);

        String [] arr = {"om","ram","shani"};

        System.out.print("input: ");
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
           
        }


        System.out.println();
        System.out.print("out put: ");
        for(int i=0 ; i<arr.length ; i++)
        {
            String s = arr[i];
            char c = s.charAt(0);
            String s1 = String.valueOf(c);
            String s2 = s1.toUpperCase();
            // System.out.println(s2);
            s = s.replace(s1, s2);
            System.out.print(s + " ");


        }


        

    }

}
