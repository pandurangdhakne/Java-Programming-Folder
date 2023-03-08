
class A
{
    int id;String name; String city;

        public A(int id , String name)
        {
            this.id = id;
            this.name = name;
        }
        
        
        public A(int id, String name, String city)
        {
            this(id,name); // this() constructor
            this.city = city;
        }


        public void display()
        {
            System.out.println("id: "+ id + " name: "+ name + " city: "+ city);
        }

}

public class ThisConstructor {
       public static void main(String[] args) {
        
         A a1 = new A(2000,"rebel","pune");
         a1.display();
          

    }

}
