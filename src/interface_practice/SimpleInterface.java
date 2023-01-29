package interface_practice;


interface A{
    void A();
}

public class SimpleInterface implements A{
    @Override
    public void A() {
        System.out.println("This is Method A from interface A.");
    }

    public static void main(String[] args) {
        SimpleInterface obj = new SimpleInterface();
        obj.A();
    }
}
