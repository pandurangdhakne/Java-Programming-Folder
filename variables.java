public class variables {
    
  /*
    String:- stores text,such as "hello".string value are surrounding by double quotes
    int:-    stores integers (whole numbers), without decimal ,such as 123 or -123
    float(f):-  stores floating point numbers, with decimal ,such as 9.99 or -19.99
    char:-   stores single characters such as 'a' or 'B' char values are surrounding by single quotes
    bollean:-stores values with two states: [true or false]
    double(d):-

    final:- however you can add the "final" keyword if you don't want others (or yourself) to overwrite
            existing values (this will declare the variable as "final" or "constant", which means unchangeable and read only)
    
    
     final int a=25 // generate the error

  */

     // type variable = value
     // float a = 1.9f;
     // double n = 2.22d;

     public static void main(String[] args) {
        
        int a = 10;
         System.out.println(a);

        int b,c,d;
        b=10;
        c=23;
        d=b+c;
        System.out.println(d);

        String name = "omakr";
        System.out.println(name);
        System.out.println("My name is c" +name);


        float m = 1.2f;
        System.out.println(m);

        char n = 'v';
        System.out.println(n);

        boolean t = true;
        boolean f = false;
        System.out.println(t);
        System.out.println(f);


     }


}
