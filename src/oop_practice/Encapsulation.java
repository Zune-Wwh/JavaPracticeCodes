package oop_practice;

class Encap1{
    private String name;
    private int age;
    private String uni;

    public String getName() {
        return name;
    }

    public String getUni(){
        return uni;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setUni(String uni){
        this.uni=uni;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Encap1 obj = new Encap1();
        obj.setName("Zune");
        obj.setAge(20);
        obj.setUni("Lithan");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getUni());

    }

}
