package interface_practice;


interface X{
    void X();
}

interface Y{
    void Y();
}

public class MultipleInheritanceFromClass implements X,Y{

    @Override
    public void X() {
        System.out.println("This is Method X.");
    }

    @Override
    public void Y() {
        System.out.println("This is Method Y.");
    }

    public static void main(String[] args) {
        MultipleInheritanceFromClass obj = new MultipleInheritanceFromClass();
        obj.X();
        obj.Y();
    }
}
