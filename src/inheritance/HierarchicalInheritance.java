package inheritance;

class A{
    void A(){
        System.out.println("This is Method A");
    }
}

class B extends A{
    void B(){
        System.out.println("This is Method B");
    }
}

class C extends A{
    void C(){
        System.out.println("This is Method C");
    }
}

class D extends A{
    void D(){
        System.out.println("This is Method D");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        B obj = new B();
        C obj1= new C();
        D obj2 = new D();

        obj.A();
        obj1.A();
        obj2.A();

    }
}
