package abstract_practice;

/*
We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects
(each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor
of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
Create an object for eac of the two classes and print the percentage of marks for both the students.
 */

abstract class Marks{
    abstract float getPercentage();
}

class A extends Marks{
float mark1, mark2, mark3;
A(float mark1,float mark2,float mark3){
    this.mark1=mark1;
    this.mark2=mark2;
    this.mark3=mark3;
}

    @Override
    float getPercentage() {
    float total = ((mark1+mark2+mark3)/300)*100;
        return total;
    }
}

class B extends Marks{
    float mark1, mark2, mark3,mark4;
    B(float mark1,float mark2,float mark3, float mark4){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.mark4=mark4;
    }
    @Override
    float getPercentage() {
        float total =((mark1+mark2+mark3+mark4)/400)*100;
        return total;
    }
}
public class Q3 {
    public static void main(String[] args) {
        A classA = new A(90,90,100);
        B classB = new B(90,80,90,98);

        System.out.println(classA.getPercentage());
        System.out.println(classB.getPercentage());
    }
}
