package statikAndNeasedClasses.task2;

public class Main {
    public static void main(String[] args) {
        Vehicle.print();
        Wheel.print();
        Door.print();
    }
}

abstract class Vehicle {
    public static void print() {
        System.out.println("Vehicleclass.print");
    }
}

class Wheel extends Vehicle{
    public static void print(){
        System.out.println("Wheelclass.print");
    }
}

class Door extends Vehicle{
    public static void print(){
        System.out.println("Doorclass.print");
    }
}


