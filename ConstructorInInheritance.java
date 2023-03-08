

class base{

    base(){
        System.out.println("I am a constructore for a base class without parameter");
    }
    base(int x){
        System.out.println("Take to derive class constructor b is base x="+x);
    }

}

class derive extends base{

    derive(){
        System.out.println("I am derive class constructor without parameter");
    }

    derive(int a,int b){
        super(b);
        System.out.println("derive a= "+a  +"  derive b="+b);
    }

}



// main fuunction

public class ConstructorInInheritance {
    
    public static void main(String[] args) {
        
       derive obj = new derive(12,15);
       derive obj1 = new derive();

    }

}
