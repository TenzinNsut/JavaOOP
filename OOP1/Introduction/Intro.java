package com.OOP1.Introduction;
import java.util.*;
public class Intro {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Tenzin";
        s1.rno = 4;
        s1.marks = 97.4f;

        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.marks);

    }
}
class Student{
    int rno;
    String name;
    float marks;
}

