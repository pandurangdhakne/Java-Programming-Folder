import java.util.Scanner;

class base{

    public int a;
    public int b;
    public int f=23;
    public int g=34;

    public void get(int c, int d){
        
        a=c;
        b=d;

    }

    public void show(){
        System.out.println("a="+a +" "+ "b="+b);
    }

}

class derive extends base{

 public void getting(){
     System.out.println("getting to the base class"+"f="+f +" & "+ "g="+g);
 }

}



public class inheritance_method {
    
  public static void main(String[] args) {
      
    derive obj = new derive();

    Scanner object = new Scanner(System.in);
    System.out.print("enter tyhe value of n= ");
    int n = object.nextInt();
    System.out.print("enter tyhe value of m= ");
    int m = object.nextInt();

    obj.get(n,m);
    obj.show();
    obj.getting();
    

  }

}
