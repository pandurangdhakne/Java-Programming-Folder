/**
 * CreateFile
 */

import java.io.*;

public class CreateFile {

    
    public static void main(String[] args) throws IOException {
        
        File f = new File("C:\\Users\\pandurang\\Desktop\\filehandle");

        if(f.createNewFile())   // IOExcption occure here we handle exception try-catch or throws keyword
        {
            System.out.println("File create successfully");
        }
        else
        {
            System.out.println("File doesn't create successfully");
        }

    }



}