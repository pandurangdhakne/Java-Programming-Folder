/*

 parseInt(String s) - This returns an integer (decimal only);
 parseInt(int i) - This return an integer , given a string representation of string representation
                   of decimal, binary,octal, or decimal,binary,octal,or hexadecimal
                   (radix equals 10,2,8, or 16 respectively) numbers as input.

parseFloat(String s)
parseDouble(String s)
parseByte(String s)
parseLong(String s)                   



*/



public class parse_format {
    
   public static void main(String[] args) {
    
          String str = "400";
          int a = Integer.parseInt(str);
          System.out.println(a);


          String s = "45.025";
          float b = Float.parseFloat(s);
          System.out.println(b);

          



   }

}
