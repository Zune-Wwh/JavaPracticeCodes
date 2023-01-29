package oop_practice;

/*
Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
 Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
 */
public class StudentName {
    String name;
    int roll_no;

    public static void main(String[] args) {
        StudentName obj = new StudentName();
        obj.name ="John";
        obj.roll_no=2;

        System.out.println("Name: "+ obj.name);
        System.out.println("Roll number: "+ obj.roll_no);
    }


}
