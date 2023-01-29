package oop_practice;

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age=age;
    }
}

class Course{
    String course;
    String university;
    Student student;

    public Course(String course, String university, Student student) {
        this.course = course;
        this.university = university;
        this.student = student;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Course student1 = new Course("Myanmar", "Lithan", new Student("Min", 23));
        System.out.println(student1.course);
        System.out.println(student1.university);
        System.out.println(student1.student.name);
        System.out.println(student1.student.age);
    }

}
