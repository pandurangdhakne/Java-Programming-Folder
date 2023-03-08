
/*

[14:29, 12/6/2022] Pandurang Dhakne: You are given N strings, each of which has been assigned a weight w_{L} and a query string G. Write a program to print the strings from the gen Ng

that Q is a sub-string of S (match is case sensitive) and the indices of all the characters of Qare the same as that in 5 mile strings match the

then print string with the highest weight.

Amdocs raints:

08

Read the input from STDIN and print the output to STDOUT. Do not write arbitrary strings while reading the input or while printing as these contribute standard output. 3 Amdocs

1) 1 <= N Number of strings <= 100

II) 1 <= n_{i} Lengths of strings <= 1000

III) 0 <= W i, Weights of strings <= 100 IV) 1 <= m Length of string Q <= 1000

V) There is no blank space present in any of the strings.

VI) All strings are case sensitive. VII) String weight(s) w_{i} are unique.

Input Format:

The first line of input contains N, the number of strings. Next N lines of input contain details of the N strings the length of the string (integer), the string, and weight of the string (integer) The

white spaces.

The last line of input contains the length of query string (integer) and query string Q, separated by a single white space

Output Format:

The output contains the string of which Q is a sub-string

Sample Input1:

4

5 books 10

6 Bookis 11

7 bookfor 12
[14:30, 12/6/2022] Pandurang Dhakne: bookfor Output?

Explanation1:

Query string Q is "book". md34737

Q is a substring of S1 (books) and $3 (bookfor). We ignore S2 due to case difference As more than one strings match the criteria, weight is considered and $3, string which are highest weight is preted as he acad

Sample Input2:

10 Hello There 47

5 5 hello 50

13 Hello There You 24

10 ThereHello 48

1 a 100

5 Hello

Sample Output2: Hello There

Explanation2:

Query string Q is "Hello".

dia63473837808

Q is a substring of S1 (HelloThere) and S2 (Hello There You). $3 (hello) is ignored as cases do not match $4 (TheraHelic

characters("Hello") in Q and S4 are different Since S1 which has the highest weight between S1 and S2, St is printed as output.


*/

import java.util.*;

public class Adenza_Q1 {
    
    public static void main(String[] args) {
        
/* 
 
Strjng s = "Pandurang";
Strjng str = "Pan";

System.out.prjntln(s.substrjng(0,3).equals(str));

*/

           Scanner sc = new Scanner(System.in);
           System.out.println("size of Query string: ");
           int q = sc.nextInt();

           String firstStr = "";
           int firstWeight = 0;

           for(int i=0 ; i<q ; i++)
           {

                firstStr = firstStr + sc.next();

                
           }
           System.out.println("Weight of Query string: ");
           firstWeight = sc.nextInt();

           System.out.println("first:  " + firstStr + "  " + firstWeight);


           System.out.println("How many string we get: ");

           int getStr = sc.nextInt();

                    for(int i=0 ; i<getStr; i++)
                    {
                        
                        String secondStr="";
                        int secondWeight=0;
                        System.out.println("lenghth of second string : ");
                        int len = sc.nextInt();
                        for(int j=0 ; j<len; j++)
                        {
                            
                            secondStr = secondStr + sc.next();
                              
                        }
                        System.out.println("Second String Weight : ");
                        secondWeight = sc.nextInt();
                        
                       if(secondStr.length() >= firstStr.length())
                       {

                        if(firstStr.substring(0, q).equals(secondStr.substring(0, q)))
                        {
                            if(secondWeight > firstWeight)
                            {
                                firstWeight = secondWeight; 
                                firstStr = secondStr;
                            }
                        }


                       }

                        System.out.println("\n");
                        
                    }

 
        
                    System.out.println(firstStr + "  " + firstWeight);

         

      

    }

}
