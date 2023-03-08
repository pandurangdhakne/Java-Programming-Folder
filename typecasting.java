/*
   Type casting is when you assign a value primitive data type to another type

   in java there are two types of casting

   1] widening casting (automatically):-  smaller type to larger type
       byte < short < char < int < long < float < double


   2] Narrowing casting (manually):- larger type to smaller type
       double < float < long < int < char < short < byte    

*/



public class typecasting {
    
   public static void main(String[] args) {
       // widening typecasting
       int a = 25;
       double b = a;
       System.out.println(a);
       System.out.println(b);

       // narrowing typecasting
       double c = 123.25d;
       int d = (int) c;
       System.out.println(c);
       System.out.println(d);

   }

}
