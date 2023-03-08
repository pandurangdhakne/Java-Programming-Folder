// // To delete a file in Java, use the delete() method:

import java.io.File;  // Import the File class

public class delete_file {
  public static void main(String[] args) { 
    File myObj = new File("filename.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
 



// Delete a Folder
// You can also delete a folder. However, it must be empty:

/*
    File myObj = new File("C:\\Users\\pandurang\\Desktop\\java\\filename.txt"); 
    if (myObj.delete()) { 
    System.out.println("Deleted the folder: " + myObj.getName());
    } else {
    System.out.println("Failed to delete the folder.");
    } 

*/    

  } 
}