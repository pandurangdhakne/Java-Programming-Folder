import java.security.PublicKey;

/*
 
*********** interface **********
Another way to achieve "abstraction" in java,is with "interface"

*/

// 1st type

interface animal{
    public void animalsound();
    public void sleep(int hour);
}

class tiger implements animal{

    public void animalsound(){
        System.out.println("roar type sound");
    }

    public void sleep(int hour){
        System.out.println("sleep hour= "+hour);
    }
}


// 2nd type
 interface dog{
     public void sound();
 }

 interface cat{
     public void catwalk();
 }

 class man implements dog,cat{
     public void sound(){
         System.out.println("bho bho bho bho");
     }

     public void catwalk(){
         System.out.println("stylish catwalk");
     }

 }



public class interface_class{

    public static void main(String[] args) {
       
        // 1st type
        tiger obj = new tiger();
        obj.animalsound();
        obj.sleep(8);
    
        // 2nd type
        man obj2 = new man();
        obj2.sound();
        obj2.catwalk();



    }
    
}
