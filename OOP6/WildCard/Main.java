package com.OOP6.WildCard;


import java.util.Arrays;

// extends Number: will only allow int,float,double...[No string]
class CustomGenericArrayList<T extends Number>{
    private Object data[];
    private static int DEFAULT_SIZE = 10;
    private int userSize;

//  Constructor; calling this generates an empty array of DEFAULT_SIZE = 10.
    public CustomGenericArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void insert(T inputData){
        if(isFull()){
            resize();
        }
//      insert at 0th index and size will be 1.
        data[userSize++] = inputData;
    }

    public boolean isFull(){
        return userSize == data.length;
    }

    public void resize(){
//      create new array of twice the size.
        Object temp[] = new Object[data.length *2];
//      Copy the data items from previous array.
        for(int index =0; index < data.length; index++){
//      Storing copied data in temp array.
            temp[index] = data[index];
        }
//      Now, data variable will point to temp array.
        data = temp;
    }
    public int size(){
        return userSize;
    }

    public T remove(){
        return (T)data[--userSize];
    }
    public void getItem(int index){
        System.out.println(data[index]);
    }

    public void setValue(int index, T value){
        data[index] = value;
    }

    //  To display the array.
    public String toString(){
        return Arrays.toString(data);
    }


}




class Main {
    public static void main(String[] args) {
//        Will Throw Error as it only accepts Number type "generics".
//        CustomGenericArrayList <String> list = new CustomGenericArrayList<>();
//        list.insert("Tenzin");
//        System.out.println(list);

        CustomGenericArrayList <Integer> list2 = new CustomGenericArrayList<>();
        for(int num =1; num <= 10; num++){
            list2.insert(num);
        }
        System.out.println(list2); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

//        or


        CustomGenericArrayList <Float> list3 = new CustomGenericArrayList<>();
        for(float num =1; num <= 10; num++){
            list3.insert(num);
        }
        System.out.println(list3); //[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0]

    }
}
