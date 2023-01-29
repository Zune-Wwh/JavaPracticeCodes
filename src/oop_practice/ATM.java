package oop_practice;


class Person{
    String name;
    int id;

    Person(String name, int id){
        this.name=name;
        this.id=id;
    }
}
public class ATM extends Person{
    double amount;
    ATM(String name, int id, double amount) {
        super(name, id);
        this.amount=amount;
    }

    void show(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(amount);
    }

    public static void main(String[] args) {

        ATM user1 = new ATM("Ben",2,2000000);
        user1.show();
    }
}
