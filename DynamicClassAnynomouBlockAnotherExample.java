

    interface A{

        public void show();

    }




public class DynamicClassAnynomouBlockAnotherExample {
    
    public static void main(String[] args) {
        

        A a  = new A(){

            public void show()
            {
                System.out.println("hi rebel");
            }

        };
        a.show();

    }

}
