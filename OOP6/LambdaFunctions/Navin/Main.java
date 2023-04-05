package com.OOP6.LambdaFunctions.Navin;
//source: https://www.youtube.com/watch?v=4HC_WyBSDGA
//Lambda expression(->): similar to arrow function.

@FunctionalInterface // interface having only 1 method; exception: String toString(), because it belongs to Object class.
interface interfaceA{
     void add(int a, int b);
}
//Now we have to define interface's implementation.
//class Sum implements interfaceA{
//    public void add(int a, int b){
//        System.out.println(a+b);
//    }
//}
//Now, this is too cumbersome to define implementation of interface having only 1 function [@functional interface].
//So, we can use "Anonymous Inner class" or "Lambda Expression".




class Main {
    public static void main(String[] args) {
//        interfaceA num = new Add(); // will throw error.

//          interfaceA num = new Sum();
//          num.add(5,2);

//          or

//          Anonymous Inner Class: because we are creating a class without any name; and "Inner" because it is inside "Main" class.
            interfaceA num = new interfaceA(){
                public void add(int a, int b){
                    System.out.println(a+b);
                }
            };
            num.add(5,2); // 7

//           Even shorter was to way to write using "Lambda Expression".
//           Here, "->" represents add() [method()].
            interfaceA num2 = (int a,int b) -> System.out.println(a+b);
            num2.add(5,2); // 7


    }
}
