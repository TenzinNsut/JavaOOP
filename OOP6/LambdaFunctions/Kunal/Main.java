package com.OOP6.LambdaFunctions.Kunal;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int index=1; index <= 5; index++){
            list.add(index);
        }
        list.forEach((item)-> System.out.print(item * 2 + " ")); // 2 4 6 8 10

    }
}
