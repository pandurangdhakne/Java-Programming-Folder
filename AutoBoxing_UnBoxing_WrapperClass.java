


public class AutoBoxing_UnBoxing_WrapperClass {
    
    public static void autoboxing()
    {
        
        int i = 100;

        Integer j =Integer.valueOf(i);  // run in JVM

        Integer ab = i;
           
        System.out.println("in jvm: " + j + "           " + "direct convert primitive to wrapper: " + ab);
        
    }
    
    public static void unboxing()
    {

        Integer i = 10;

        int j = i.intValue(); // run in JVM

        int ab = i;

        System.out.println("in jvm: " + j + "           " + "direct convert wrapper to primitive: " + ab);
        

    }

    public static void main(String[] args) {
    
        // autoboxing    -> primitive to wrapper class
        autoboxing();
        AutoBoxing_UnBoxing_WrapperClass.autoboxing();
        AutoBoxing_UnBoxing_WrapperClass k = new AutoBoxing_UnBoxing_WrapperClass();
        k.autoboxing();


        System.out.println("\n\n");
        unboxing();
        AutoBoxing_UnBoxing_WrapperClass.unboxing();
        AutoBoxing_UnBoxing_WrapperClass m = new AutoBoxing_UnBoxing_WrapperClass();
        m.unboxing();


    }


}
