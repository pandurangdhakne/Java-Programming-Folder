
/*

   int,double,char,string,boolean

   // data types divided into groups:
    
      1] primitive data type:- invludes [byte,short,long,int,float,double,boolean,char]
      2] Non-primitive:- such as [string,array, classes]


*/
/*
  
  byte = 1byte
  short = 2byte
  int = 4bytes
  float = 4bytes
  long = 8bytes
  double = 8bytes
  boolean = 1bit
  char = 2bytes


*/


public class data_type {

    public static void main(String[] args) {
       
        byte mybyte = 100;
        System.out.println("byte= "+mybyte);

        short myshort = 5000;
        System.out.println("short= "+myshort);

        int myint = 10000;
        System.out.println("int= "+myint);

        long mylong = 15468793549L;
        System.out.println("long= "+mylong);

        float myfloat = 5.26f;
        System.out.println("float= "+myfloat);

        double mydouble = 19.25d;
        System.out.println("double= "+mydouble);

        // scientific numbers [float & double]:- a floating point numbers can also be a scientific number can an 'e' or 'E' to indicate of 10

        float d1 = 35e3f;
        double d2 = 35E4d;
        System.out.println("scientific number float= "+d1);
        System.out.println("scientific number double= "+d2);


    }

}
