package inheritance;

class AB{
    void A(){
        System.out.println("This is Method A");
    }
}
class BC extends AB{
    void B(){
        System.out.println("This is Method B");
    }
}

class CD extends BC{
    void C(){
        System.out.println("This is Method C");
    }
}

public class MultiLevelInheritance  {
    public static void main(String[] args) {
        CD obj = new CD();
        obj.A();
        obj.B();
        obj.C();
    }
}
