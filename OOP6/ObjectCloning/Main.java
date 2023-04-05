package com.OOP6.ObjectCloning;

class Student implements Cloneable{
    String name;
    int age;

//  constructor.
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

//   copy constructor.
    public Student(Student other){
        this.name =  other.name;
        this.age = other.age;
    }

    public void display(){
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);

    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}



public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 =  new Student("Tenzin", 20);
//      copied values from s1 into s2.
//       Student s2 = new Student(s1); // this will be taking a lot of processing time.

//      So we will be using "clone"; which is a "method()" in the "object class".
        Student s2 =  (Student) s1.clone();


        s1.display();
        s2.display();


    }

}
