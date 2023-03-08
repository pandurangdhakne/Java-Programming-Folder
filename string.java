public class string {
    
    public static void main(String[] args) {
        
        String name ="hello";
        System.out.println(name);
        System.out.println("uppercase="+ name.toUpperCase());
        System.out.println("lowercase="+ name.toLowerCase());

        String txt =" your name is omkar";
        System.out.println("finding position = "+txt.indexOf("omkar"));

        String firstname = "omkar";
        String lastname = "dhakne";
        System.out.println(firstname + " " + lastname ); // concatenation
        System.out.println(firstname.concat(lastname));


    }

}
