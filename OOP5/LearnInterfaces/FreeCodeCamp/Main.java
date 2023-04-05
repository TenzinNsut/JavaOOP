package com.OOP5.LearnInterfaces.FreeCodeCamp;

interface Vehicle{
//  final static int GEARS = 5;

//  By Default: abstract
    void gears(int gear);
    void speedUp(int change);
    void slowDown(int change);
}

class Car implements Vehicle{
//  Making encapsulated class; by making instance variables private.
    private int gear = 1;
    private int speed = 0;

//  Getter + setter
    public void gears(int gear){
        this.gear = gear;
    }
    public void speedUp(int change){
        this.speed += change;
    }
    public void slowDown(int change){
        this.speed -= change;
    }

//  To display everything:
    public void display() {
        System.out.println("I am Car, going " + this.speed + "km/h and I am in " + this.gear + "th gear." );
    }


}


class Main {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.gears(5);
        ford.speedUp(50);

        ford.display(); //I am Car, going 50km/h and I am in 5th gear.


    }
}
