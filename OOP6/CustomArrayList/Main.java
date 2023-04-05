package com.OOP6.CustomArrayList;

import java.util.ArrayList;
import java.util.Arrays;

class CustomArrayList{


//  Data hiding.

//  Note: we can only add int type; input.
    private int data[];
    private static int DEFAULT_SIZE = 10;
    private int userSize;

//  constructor; creates default array of size 10;
    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void insert(int inputNumber){
//      checks whether array is full or not.
        if(isFull()){
            resize();
        }
//      insert at 0th index and size will be 1;
        data[userSize++] = inputNumber;
    }
    public boolean isFull(){
        return userSize == data.length;
    }
    public void resize(){
//      create new array of twice the size.
        int temp[] = new int[data.length * 2];

//      copy the data items form previous array
        for(int index = 0; index < data.length; index++){
//      copied array in temp[index];
            temp[index] = data[index];
        }
//      data will point to temp(new array)
        data = temp;
    }

    public int remove(){
        return data[--userSize];
    }

    public void getItem(int index){
        System.out.println(data[index]);
    }

    public void setValue(int index, int value){
        data[index] = value;
    }

//  custom toString();
    public String toString() {
        return Arrays.toString(data);
    }



}

class Main {
    public static void main(String[] args) {
//        ArrayList arr = new ArrayList(6);
        CustomArrayList list = new CustomArrayList();
        list.insert(2);
        list.insert(5);
        list.setValue(4,25);

//      System.out.println(list.toString()); // need to create custom toString();\
        System.out.println(list); // [2, 5, 0, 0, 25, 0, 0, 0, 0, 0]

        list.getItem(4); // 25


//      ArrayList<Generics>
//      Generics: defines the type; provides type safety.
//        ArrayList<Integer> list2 = new ArrayList();
//        for(int index = 1; index <11; index++){
//            list2.add(index);
//        }


    }
}
