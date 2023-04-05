package com.OOP5.LearnInterfaces.Kunal;

interface engine{
//  By default, abstract.
    void topSpeed(int speed);
    void engineType(String type);

//  extra:
//    void move();
}

interface interior{

//    void move();
    void numSeats(int seats);
    void seatCover(String cover);
}

class Car implements engine, interior{

//  instance variables
    private int speed = 0;
    private String type = "";
    private int seats = 1;
    private String cover = "default";


//  By default abstract.
    @Override
    public void topSpeed(int speed){
        this.speed = speed;
    }
    @Override
    public void engineType(String type) {
        this.type = type;
    }


//  since, both interfaces have same methods(); hence it is difficult to determine which method to call.
//    public void move() {
//    }
//   so we need to create separate classes for the move() function.

    @Override
    public void numSeats(int seats) {
        this.seats = seats;
    }
    @Override
    public void seatCover(String cover) {
        this.cover = cover;
    }

//  Display
    public void display(){
        System.out.println("Engine: " + this.type);
        System.out.println("TopSpeed: " + this.speed);
        System.out.println("NumSeats: " + this.seats);
        System.out.println("SeatCover: " + this.cover);
    }
}


class Main {
    public static void main(String[] args) {
        Car suzuki  = new Car();
        suzuki.engineType("V8");
        suzuki.topSpeed(53);
        suzuki.numSeats(5);
        suzuki.seatCover("Leather");

        suzuki.display();
//        Engine: V8
//        TopSpeed: 53
//        NumSeats: 5
//        SeatCover: Leather




    }
}
