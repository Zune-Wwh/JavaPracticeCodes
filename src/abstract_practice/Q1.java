package abstract_practice;

/*
  Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name
 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message'
  by creating an object for each subclass.
 */

abstract class Parent{
    abstract void message();
}

class FirstClass extends Parent{

    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondClass extends Parent{

    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}

public class Q1 {
    public static void main(String[] args) {
        FirstClass obj1= new FirstClass();
        SecondClass obj2= new SecondClass();

        obj1.message();
        obj2.message();
    }
}
