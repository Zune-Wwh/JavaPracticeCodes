package abstract_practice;


abstract class ParentAbstract{
    abstract void calculate();
}
public class AbstractClass extends ParentAbstract{
    @Override
    void calculate() {
        System.out.println("This is calculate method from Parent Abstract Class");
    }

    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass();
        obj.calculate();
    }
}
