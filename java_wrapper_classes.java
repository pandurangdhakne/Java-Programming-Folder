
/*
    ************ java wrapped classes *************

    -> wrapped clases provide a way to use primitive data types (int , boolean, ets..) as objects.

    primitive data type                wrapped classes

    byte                               Byte
    short                              Short
    int                                Integer
    long                               Long
    float                              Float
    double                             Double
    boolean                            Boolean
    char                               Character


*/

/*

intValue(),byteValue(),shortValue(),longValue(),floatValue(),doubleValue(),charValue(),booleanValue().

*/


public class java_wrapper_classes {
    
    public static void main(String[] args) {
        Integer myint = 25;
        Double mydouble = 20.65d;
        Float myfloat = 2.56f;
        Character mychar = 'A';

        System.out.println(myint);
        System.out.println(mydouble);
        System.out.println(myfloat);
        System.out.println(mychar);

    System.out.println("\n\n");
    
        System.out.println(myint.intValue());
        System.out.println(mydouble.doubleValue());
        System.out.println(myfloat.floatValue());
        System.out.println(mychar.charValue());


        /*
     
        in the following example, we convert an "Integer" to a "String" , and use the lenght() method of the String class to 
        output the lenght of the "string". 

        */
        
    System.out.println("\n\n");
    
        Integer a = 54554;
        String str = a.toString();
        System.out.println(str);
        System.out.println("lenght = "+str.length());







    }

}
