import java.util.HashSet;





public class java_hashset {

    public static void main(String[] args) {
        
       HashSet<Integer> number = new HashSet<Integer>();
// re[eate numbers in consider only one
       number.add(10);
       number.add(60);
       number.add(30);
       number.add(30);
       number.add(40);

       System.out.println(number);


    System.out.println("\n\n");   
       // size()
       System.out.println(number.size()); 

    
    System.out.println("\n\n");    
       // contains()  cheack if an item exits      true or false
       System.out.println(number.contains(20));
       System.out.println(number.contains(60));


    System.out.println("\n\n"); 
       // remove()
       number.remove(10);           // not index through
       System.out.println(number);

     
     
    System.out.println("\n\n"); 
       // loop through hashset
       for (Integer i : number) {
           System.out.println(i);
       }
       



    System.out.println("\n\n"); 
       // other type
       for(int i=0 ; i<=60 ; i+=10){
           
          if(number.contains(i)){
              System.out.println( i +" :was fount in the set");
          }
          else{
            System.out.println( i +" :was not fount in the set");
          }

       }



    }

}
