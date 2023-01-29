package polymorphism;

public class Polymorphism {
    static void calculate(int a,int b){
        System.out.println(a+b);
    }

    static void calculate(int a){
        System.out.println(a+a);
    }

    static void calculate(double b){
        System.out.println(b+b);
    }

    public static void main(String[] args) {
        calculate(5);
        calculate(3,4);
        calculate(5.0);
    }
}
