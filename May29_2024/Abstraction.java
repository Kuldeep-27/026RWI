package May29_2024;

interface Animal{
    void eat();
}

class Dog implements Animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
}

class Cat implements Animal{
    public void eat(){
        System.out.println("Cat is eating");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        a = new Cat();
        a.eat();
    }
}
