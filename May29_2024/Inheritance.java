package May29_2024;


class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name : " + name + " ," + "age : " + age);
    }
}

class Employee extends Person{
    float salary;

    Employee(String name,int age,float salary){
        super(name,age);
        this.salary = salary;
    }

    void display(){
        System.out.println("Name : " + name + " ," + "age : " + age + ", " + "Salary : " + salary);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kuldeep",24,25000);
        e1.display();
    }
}
