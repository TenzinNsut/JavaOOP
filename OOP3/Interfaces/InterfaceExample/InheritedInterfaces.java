package com.OOP3.Interfaces.InterfaceExample;

interface interfaceA {
//    int x; would throw error;
//    as in the case of interface; variables are both "static" and "final" by default.
//    So, variables must be fully initialised.
    int age = 12;
    int standard = 9;
//    Also note that, since these variables are "static";
//    therefore, these can be accessed without creating any object.

//    Note: be default "methods()" in interfaces are "abstract"
    void hello();
    void greet();

}

interface interfaceB {
    void tell();
}

interface interfaceC extends interfaceA,interfaceB {
// Note: interface can inherit "two" interfaces; but that is not possible in case of classes.
// Similar to inheritance of classes.
// Interface C, will have access to both methods of "interface A" and "interface B"
    void show();
}


class Display implements interfaceC{

    public void hello(){
        System.out.println("HELLO");
    }

    public void greet(){
        System.out.println("Greet");
    }
    public void tell(){
        System.out.println("show");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}


//NOTE:
// interface -> interface : extends
// class -> interface: implements
// class -> class : extends

public class InheritedInterfaces {
    public static void main(String[] args) {

        System.out.println("----------interfaceA----------");
        interfaceA obj = new Display();
//      since; interface A has access two only two methods(), therefore we can only invoke those two methods
        obj.hello();
        obj.greet();

//      obj.show(); will throw error; as interfaceA has access to just two methods() ; just like inheritance in classes.

//      interfaceC has access all its PARENT-interface methods().
        System.out.println("----------interfaceC----------");
        interfaceC obj2 = new Display();
        obj2.hello();
        obj2.greet();
        obj2.tell();
        obj2.show();
    }
}
