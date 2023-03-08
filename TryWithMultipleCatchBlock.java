public class TryWithMultipleCatchBlock {
    
public static void main(String[] args) {
    
  
   

try {
    
   int a[] = new int[3];

   a[0] = 10; a[1] = 1;
   a[2] = 100;

   //int b = a[0]/0;

   System.out.println(a[3]/0);


} 
catch(ArrayIndexOutOfBoundsException e)
{
    System.out.print("ArrayIndexOutOfBoundException : "+ e);
}

catch (ArithmeticException e) {
    System.out.print("ArthmeticException : " + e);
 }

}

}
