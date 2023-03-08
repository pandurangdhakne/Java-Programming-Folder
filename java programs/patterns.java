public class patterns {
  
    public static void main(String[] args) {
       // 1st square pattern 
       System.out.println("1st pattern");
         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=1 ; j<=5 ; j++)
             {
                 System.out.print("*");
               
             }
             System.out.println("\n");
         }
   

         // 2nd pattren
         System.out.println("2nd pattern");
         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=1;j<=5;j++)
             {
                 System.out.print(j);
             }
             System.out.println("\n"); 
         }


         // 3rd pattern

         System.out.println("3rd pattern");
         for(char i='A' ; i<='E' ; i++)
         {
             for(char j='A' ; j<='E' ; j++)
             {
                 System.out.print(j);
             }
             System.out.println("\n");
         }



         // 4th pattern

         System.out.println("4th pattern");
         for(char i='A' ; i<='E' ; i++)
         {
             for(char j='A' ; j<='E' ; j++)
             {
                 System.out.print(i);
             }
             System.out.println("\n");
         }

         // 5th pattern
         System.out.println("5th pattern");
         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=1 ; j<=i ; j++)
             {
                 System.out.print(j);
             }
             System.out.println("\n");
         }

          
         // 6th pattern
         System.out.println("6th pattern");
         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=5; j>=i ; j--)
             {
                 System.out.print(" ");
             }
             for(int k=1 ; k<=i ; k++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }


         // 7th pattern
         System.out.println("7th pattern");
         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=1 ; j<=i ; j++)
             {
                 System.out.print(" ");
             }
             for(int k=5 ; k>=i ;k--)
             {
                 System.out.print("*");
             }
             System.out.println();
         }


         // 8th pattern
         System.out.println();
         System.out.println();
         System.out.println("8th pattern");
         
         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=5; j>=i ; j--)
             {
                 System.out.print(" ");
             }
             for(int k=1 ; k<=i ; k++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }

         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=1 ; j<=i ; j++)
             {
                 System.out.print(" ");
             }
             for(int k=5 ; k>=i ;k--)
             {
                 System.out.print("*");
             }
             System.out.println();
         }

          
         System.out.println();
         System.out.println();
         System.out.println("9th pattern");
         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=1 ; j<=i ; j++)
             {
                 System.out.print("*");
             }
            
             System.out.println();
         }


   
         System.out.println();
         System.out.println();
         System.out.println("10th pattern");
         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=5 ; j>=i ; j--)
             {
                 System.out.print("*");
             }
            
             System.out.println();
         }


         
         System.out.println();
         System.out.println();
         System.out.println("11th pattern");

         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=1 ; j<=i ; j++)
             {
                 System.out.print("*");
             }
            
             System.out.println();
         }

         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=5 ; j>=i ; j--)
             {
                 System.out.print("*");
             }
            
             System.out.println();
         } 



         System.out.println();
         System.out.println();
         System.out.println("12th pattern");
         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=5 ; j>=i ; j--)
             {
                 System.out.print(" ");
             }
             for(int k=1 ; k<=i ; k++)
             {
                 System.out.print("*");
             }
             for(int h=2 ; h<=i ; h++)
             {
                 System.out.print("*");
             }

             System.out.println();
         }


         
         System.out.println();
         System.out.println();
         System.out.println("13th pattern");
         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=1 ; j<=i ; j++)
             {
                 System.out.print(" ");
             }
             for(int k=5 ; k>=i ; k--)
             {
                 System.out.print("*");
             }
             for(int h=4 ; h>=i ; h--)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
         
         System.out.println();
         System.out.println();
         System.out.println("14th pattern");
         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=5 ; j>=i ; j--)
             {
                 System.out.print(" ");
             }
             for(int k=1 ; k<=i ; k++)
             {
                 System.out.print("*");
             }
             for(int h=2 ; h<=i ; h++)
             {
                 System.out.print("*");
             }

             System.out.println();
         }
         
         for(int i=1 ; i<=5 ; i++)
         {
             for(int j=1 ; j<=i ; j++)
             {
                 System.out.print(" ");
             }
             for(int k=5 ; k>=i ; k--)
             {
                 System.out.print("*");
             }
             for(int h=4 ; h>=i ; h--)
             {
                 System.out.print("*");
             }
             System.out.println();
         }


         System.out.println();
         System.out.println();
         System.out.println("15th pattern");
         for(int i=1 ; i<=5 ;i++)
         {
             for(int j=1; j<=5 ; j++)
             {
                if(i>=2 && j>=2 && i<=4 && j<=4)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
             }
             System.out.println();
         }

         





    }
}
