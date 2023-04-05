package com.OOP4;

class ObjectDemo {

    int val;

    ObjectDemo(){};

    ObjectDemo(int val){
        this.val = val;
    }



//  Garbage collection: what to after object has been destroyed.
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

//  Gives String representation.
    @Override
    public String toString() {
        return super.toString();
    }

//  It gives numbered representation of an object.[not address]
//  It may be helpful to identify; whether it is same object or not.
    @Override
    public int hashCode() {
        return super.hashCode();
    }

//  check whether two objects are same/equals or not.
    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.val == ((ObjectDemo)obj).val;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    public static void main(String[] args) {
        ObjectDemo d = new ObjectDemo();
        ObjectDemo d2 = new ObjectDemo();

//  It may be helpful to identify; whether it is the same object or not.
        System.out.println(d.hashCode()); //1989780873
        System.out.println(d2.hashCode()); //1480010240



        ObjectDemo obj1 = new ObjectDemo(12);
        ObjectDemo obj2 = new ObjectDemo(12);

//      Here "==" whether both objects are pointing to same thing or not.
        if(obj1 == obj2){
            System.out.println("Obj1==Obj2");
        }
        if(obj1.equals(obj2)){
            System.out.println("Obj1.equals(Obj2)"); //Obj1.equals(Obj2)
        }

    }


}
