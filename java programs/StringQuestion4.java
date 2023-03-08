
// try copy pase program

public class StringQuestion4 {
    
    public static void main(String[] args) {

        String s = "Pandurang";
        String s1 = "Mrunal";

        s1=s1.substring(0,3);
        // System.out.println(s1);

       StringBuffer str = new StringBuffer(s);

       System.out.println(str.insert(3,s1));

        // output: PanMrudurang

    }

}






