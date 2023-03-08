public class garbage_collector {
    

    public static void main(String[] args) {
        
        garbage_collector obj1 = new garbage_collector();
        garbage_collector obj2 = new garbage_collector();

        obj1 = null;
        obj2 = null;
    
        System.gc();

    }

 


}
