/*
 write a program input 2 numbers and swap them without using third variable
 */


 
public class swap_without_third_var {

    public static void main(String[] args) {
        
        int a = 30;
        int b = 20;

        System.out.println("before swaping \n a = "+a +" "+ " b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("after swaping \na = "+a +" "+ " b = "+b);




    }


}