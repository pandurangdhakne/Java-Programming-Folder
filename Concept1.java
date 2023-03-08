import java.util.Scanner;

class A{

int a = 10;
int b = 20;

}
class B extends A{

    int c=0;
    int d=0;

}


public class Concept1 {
    
    public static A text()
    {
        A a1 = new A();

        return a1;
    }

    public static void main(String[] args) {
        
           B b1 = (B)text();  // derive reference = base object // using typecasting
          

    }
}
