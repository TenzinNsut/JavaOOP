package com.OOP1.Constructors;
import java.util.*;
public class Constructors {
    public static void main(String[] args) {
//   It was too cumbersome to write all object values each time separately;
//   So we use Constructors with arguments; OR "Parameterised Constructors" to pass in the values;

//      s1 -> reference variable
        Student s1 = new Student("Tenzin", 4, 95.5f);
        Student s2 = new Student("Teju", 5, 95.5f);

        System.out.println("-- Printing objects --");
        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println("- - Greeting Function - - ");
        s1.greet();
        s2.greet();

//      Passing object to the constructor
        System.out.println("- - Passing object to the constructor - - ");
        Student s3 = new Student(s1);

        System.out.println(s3.name);
        System.out.println(s3.rno);
        System.out.println(s3.marks);


//      Calling constructor form another constructor
        System.out.println(" - - Calling constructor from another constructor - - ");
        Student s4 = new Student();
        System.out.println(s4.name);
        System.out.println(s4.rno);
        System.out.println(s4.marks);
    }
}
class Student{
//  name, rno, marks -> instance variable;
    String name;
    int rno;
    float marks;

    void greet(){
        System.out.println("Hello " + name );
    }
//  Parameterised Constructors:
    Student(String studentName, int studentRno, float studentMarks){
        this.name = studentName;
        this.rno = studentRno;
        this.marks = studentMarks;
    }


//  Constructor taking value from another "object"
    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

//  Calling constructor form another constructor
    Student(){
        this("Rahul", 12,50f);
    }

}
