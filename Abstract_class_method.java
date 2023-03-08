
/*
     ************* Abstarct class ****************
     1] abstarct class is not create a object
     2] without abstarct class is create a object
     3] in without abstarct class inherite with abstract class so mainly two condition is
        front of the without abstarct class is 
            a] without abstarct class converted into abstarct class
            b] in abstract class those function or method with abstarct key word this is class abstrat method
               thos abstract method is preent in inherited class complusorly 

*/

abstract class parent // does not creat a obj for parent class because this is a Abstract class
{

    public void say() {
        System.out.println("say hello");
    }

    abstract public void setter(); // this method is complusorly put in the another inherited class those class is
                                   // not a abstract

    abstract public void getter(); // this method is complusorly put in the another inherited class those class is
                                   // not a abstract

}

class child extends parent // this class is not a abstarct class so this class is make a object
{

    public void setter() {
        System.out.println(" I am a [setter] of the child class ");
    }

    public void getter() {
        System.out.println(" I am a [getter] of the child class");
    }

}

abstract class child1 extends parent // does not creat a obj for child1 class because this is a Abstract class
{

    public void boat() {
        System.out.println(" i am a abstarct class of child1");
    }
    

}

// main class
public class Abstract_class_method {

    public static void main(String[] args) {

        child obj = new child();
        obj.setter();
        obj.getter();
        obj.say();

    }

}
