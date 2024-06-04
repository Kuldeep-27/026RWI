package May31_2024;

interface Vechicle{
    void run();
}

class Car implements Vechicle{
    public void run(){
        System.out.println("Car is Running");
    }
}

class Truck implements Vechicle{
    public void run(){
        System.out.println("Truck is Running");
    }
}

public class Interface_Example {
    public static void main(String[] args) {
        Vechicle v = new Car();
        v.run();
        v = new Truck();
        v.run();
    }
}
