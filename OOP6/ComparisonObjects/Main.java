package com.OOP6.ComparisonObjects;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

class Students implements Comparable<Students>{
//  instance variables
    int rno;
    float marks;
//  constructor
    public Students(int rno, float marks){
        this.rno = rno;
        this.marks = marks;
    }

//  for comparable object; comparing objects; helps which parameter to compare to.
    public int compareTo(Students o) {
//      We are defining which parameter to compare
        int diff = (int)(this.marks - o.marks);
        return diff;
//      if(diff == 0): means both are equal.
//      if(diff<0): means o bigger else o is smaller
    }

    @Override
    public String toString() {
        return marks + " " + rno;
    }
}


class Main {
    public static void main(String[] args) {
        Students Raj = new Students(4,95.6f);
        Students Rahul = new Students(14,92.5f);
        Students Karan = new Students(5,90.0f);
        Students Tej = new Students(2,96.0f);

        Students[] list = {Raj, Rahul, Karan, Tej};
//      Note: it is able to sort because of "compareTo"; as we have defined which parameter[marks] to compare.
        System.out.println(Arrays.toString(list)); //[95.6 4, 92.5 14, 90.0 5, 96.0 2]
        Arrays.sort(list);
        System.out.println(Arrays.toString(list)); //[90.0 5, 92.5 14, 95.6 4, 96.0 2]



//      Suppose we want to compare these two objects
//        if(Raj> Rahul){ // will throw error; as java gets confused which parameter to compare(rno or marks).
//            System.out.println("Rahul has more marks");
//        }

        if(Raj.compareTo(Rahul) < 0){
            System.out.println("Rahul has more marks");
        }else {
            System.out.println("Raj has more marks");
        }
//      output : Raj has more marks



    }
}
