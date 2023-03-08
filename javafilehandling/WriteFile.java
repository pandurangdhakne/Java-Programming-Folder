import java.io.*;


public class WriteFile {
    

    public static void main(String[] args) {
        
        
     try {
        
        FileWriter ff = new FileWriter("C:\\Users\\pandurang\\Desktop\\filehandle");
        ff.write("i love java");



     } catch (Exception e) {
         //TODO: handle exception
         System.out.println(e);
     }

 
       
    File f = new File("C:\\Users\\pandurang\\Desktop\\filehandle");

    if(f.exists())
    {
        System.out.println("file name : " + f.getName());
        System.out.println("file location : "+f.getAbsolutePath());
        System.out.println(f.canExecute());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.delete());


    }

    else{
        System.out.println("jvchsvchv");
    }



    }


}
