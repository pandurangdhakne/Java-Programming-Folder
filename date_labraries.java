import java.time.LocalDate; // (yyyy-MM-dd)
import java.time.LocalTime; // (HH-mm-ss-ns)
import java.time.LocalDateTime; // (yyyy-MM-dd-HH-mm-ss-ns)
import java.time.format.DateTimeFormatter; // formatter for displaying and parsing date time objects




public class date_labraries {

    public static void main(String[] args) {
        
        LocalDate obj = LocalDate.now(); // creating a date object
        System.out.println("localdate= "+obj);


        LocalTime obj2 = LocalTime.now(); // creating a time object
        System.out.println("localtime= "+obj2);


        LocalDateTime obj3 = LocalDateTime.now(); // creating date and time object
        System.out.println("LocalDateTime= "+obj3);

        
        LocalDateTime obj4 = LocalDateTime.now(); // cretaing date and time object
        System.out.println("before format date and time= "+obj4);
        DateTimeFormatter obj5 = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss"); // create the formate date & time
        String obj6 = obj4.format(obj5);
        System.out.println("After format date and time= "+obj6);



        /*
           ofpattern():-  "yyyy-MM-dd" "dd/MM/yyyy" "dd-MMM-yyyy" "E,MMM dd yyyy"
           E = day
           MMM = month 

        */

    }
    
}
