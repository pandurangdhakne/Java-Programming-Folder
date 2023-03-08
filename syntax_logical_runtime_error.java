public class syntax_logical_runtime_error {
    
   public static void main(String[] args) {
       

    // ****** sysntax error ******
    // int a = 19
    // System.out.println(b);

// ******* logical error *********
// code is run , but actually we want those output that output we not get
    for(int i=0; i<5; i++){
        System.out.println("prime number is= "+ (2*i+1));
    }


// ****** runtime error *******    
    int c=0;
    System.out.println("dividation is="+ 1000/c);



   }


}
