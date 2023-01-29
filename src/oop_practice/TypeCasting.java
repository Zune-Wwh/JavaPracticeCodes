package oop_practice;



public class TypeCasting {
    int a = 5;
    double b = 2.5;
    int c= (int) b;
    double d=a;


    public static void main(String[] args) {
        TypeCasting obj = new TypeCasting();
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
