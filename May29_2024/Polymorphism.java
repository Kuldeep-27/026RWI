package May29_2024;

import java.sql.SQLOutput;

class Area{

    int area(int length,int breadth){
        return length*breadth;
    }


    float area(int radius){
        return 3.14f*radius*radius;
    }


}



public class Polymorphism {

    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("Area of rectangle " + a.area(3,4));
        System.out.println("Area of Circle is " + a.area(7));

    }

}
