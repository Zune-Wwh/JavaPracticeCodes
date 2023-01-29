package oop_practice;

class A{
     A obj() {
         return this;
    }
}

class B{
    B obj(){
        return this;
    }
}

public class Covarent {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a.obj());
        System.out.println(b.getClass().getName());
    }
}
