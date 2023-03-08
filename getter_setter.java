import java.util.Scanner;


class base{
    public int a , b;
    //public int b;

    public int get(){
        return a + b;
    }

    public void set(int n, int m){
       // this.a = n;
       // this.b = m;
       a=n;
       b=m;
    }

} 




// MAIN FUNCTION
public class getter_setter {

    public static void main(String[] args) {
        
        base obj = new base();
        obj.set(10,20);
        System.out.println(obj.get());


    }

}
